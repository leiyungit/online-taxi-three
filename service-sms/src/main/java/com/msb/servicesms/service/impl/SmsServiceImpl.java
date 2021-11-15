package com.msb.servicesms.service.impl;

import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.servicesms.SmsTemplateDto;
import com.msb.internalcommon.dto.servicesms.request.SmsSendRequest;
import com.msb.servicesms.constant.SmsStatusEnum;
import com.msb.servicesms.dao.ServiceSmsRecordDao;
import com.msb.servicesms.dao.ServiceSmsTemplateCustomDao;
import com.msb.servicesms.entity.ServiceSmsRecord;
import com.msb.servicesms.entity.ServiceSmsTemplate;
import com.msb.servicesms.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class SmsServiceImpl implements SmsService {

    /**
     * 缓存用于替换内容的模板
     */
    private Map<String, String> templateMaps = new HashMap<>();

    @Autowired
    private ServiceSmsTemplateCustomDao smsTemplateDao;

    @Autowired
    private ServiceSmsRecordDao smsRecordDao;

    @Override
    public ResponseResult sendSms(SmsSendRequest smsSendRequest) {
        // 遍历手机号
        for (String phoneNumber : smsSendRequest.getReceivers()) {
            ServiceSmsRecord smsRecord = new ServiceSmsRecord();
            smsRecord.setPhoneNumber(phoneNumber);

            List<SmsTemplateDto> templates = smsSendRequest.getData();
            // 遍历待发送的模板
            // 81B*10 1024 1K 10*1024  1M
            for (SmsTemplateDto template : templates) {
                // 查询模板id是否在缓存map中，不在则添加到内存
                if (!templateMaps.containsKey(template.getId())) {
                    ServiceSmsTemplate serviceSmsTemplate = smsTemplateDao.selectByTemplateId(template.getId());
                    if(serviceSmsTemplate == null){
                        log.error("[SmsService] 发送短信，未定义模板id：", template.getId());
                        return ResponseResult.fail("模板未定义，模板id:"+ template.getId());
                    }
                    templateMaps.put(serviceSmsTemplate.getTemplateId(),serviceSmsTemplate.getTemplateContent());
                }
                // 替换占位符
                String content = templateMaps.get(template.getId());
                for (Map.Entry<String, Object> entry : template.getTemplateMap().entrySet()) {
                    content = StringUtils.replace(content,"${"+entry.getKey()+"}",entry.getValue()+"");
                }

                //发生错误时，不影响其他手机号和模板的发送
                try {
                    int result = send(phoneNumber, template.getId(), template.getTemplateMap());
                    // 组装SMS对象
                    smsRecord.setSendTime(new Date());
                    smsRecord.setSmsContent(content);
                    smsRecord.setSendFlag(1);
                    smsRecord.setSendNumber(0);
                    smsRecord.setOperatorName("");
                    if(result != SmsStatusEnum.SEND_SUCCESS.getCode()) {
                        throw new Exception("短信发送失败");
                    }
                    log.info("短信发送成功");
                } catch (Exception e) {
                    smsRecord.setSendFlag(0);
                    smsRecord.setSendNumber(1);
                    // e.printStackTrace();
                    log.error("发送短信（" + template.getId() + "）失败：" + phoneNumber, e);
                } finally {
                    //smsRecord.setCreateTime(new Date());
                    //smsRecord.setUpdateTime(new Date());
                    //System.out.println(smsRecord);
                    smsRecordDao.insertSelective(smsRecord);
                }

            }
        }
        return ResponseResult.success("");
    }

    private int send(String phoneNumber, String templateId, Map<String,?> map) throws Exception {
        JSONObject param = new JSONObject();
        param.putAll(map);

        return sendMsg(phoneNumber,templateId,param.toString());
    }

    private int sendMsg(String phoneNumber, String templateCode, String param){
        //TODO 调用 供应商接口 发送短信的服务
        return SmsStatusEnum.SEND_SUCCESS.getCode();
    }
}

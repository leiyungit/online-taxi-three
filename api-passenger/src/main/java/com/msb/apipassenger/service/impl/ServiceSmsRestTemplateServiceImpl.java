package com.msb.apipassenger.service.impl;

import com.msb.apipassenger.config.ServiceSmsConfig;
import com.msb.apipassenger.service.ServiceSmsRestTemplateService;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.servicesms.SmsTemplateDto;
import com.msb.internalcommon.dto.servicesms.request.SmsSendRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class ServiceSmsRestTemplateServiceImpl implements ServiceSmsRestTemplateService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ServiceSmsConfig serviceSmsConfig;
    /**
     * 短信服务--- 发送短信
     *
     * @param phoneNumber
     * @param code
     * @return
     */
    @Override
    public ResponseResult sendSms(String phoneNumber, String code) {
//        log.info("============sendSms============");
//        String http = "http://";
//        String serverName = "service-sms";
//        String method = "/send/sms-template";
//        String templateId="SMS_144145499";
//        log.info("服务名：{}, method:{}", serviceSmsConfig.getServiceName(), serviceSmsConfig.getMethod());
        String url = serviceSmsConfig.getHttp() + serviceSmsConfig.getServiceName() + serviceSmsConfig.getMethod();
        // 参数
        int templateSize = 1;
        Map<String,Object> templateMap = new HashMap<>(templateSize);
        templateMap.put("code",code);

        SmsTemplateDto smsTemplateDto = new SmsTemplateDto();
        smsTemplateDto.setId(serviceSmsConfig.getTemplateId());
        smsTemplateDto.setTemplateMap(templateMap);

        SmsSendRequest param = new SmsSendRequest();
        String[] receivers = {phoneNumber};
        param.setReceivers(receivers);
        param.setData(Arrays.asList(smsTemplateDto));

        // restTemplate.exchange(url, HttpMethod.POST,new HttpEntity<Object>(param, null) ResponseResult.class).getBody();
        return restTemplate.postForEntity(url, param, ResponseResult.class).getBody();
    }
}

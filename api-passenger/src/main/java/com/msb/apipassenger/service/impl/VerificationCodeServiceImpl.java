package com.msb.apipassenger.service.impl;

import com.msb.apipassenger.service.ServiceSmsRestTemplateService;
import com.msb.apipassenger.service.ServiceVerificationCodeRestTemplateService;
import com.msb.apipassenger.service.VerificationCodeService;
import com.msb.internalcommon.constant.CommonStatusEnum;
import com.msb.internalcommon.constant.IdentityConstant;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.serviceverificationcode.response.VerifyCodeResponse;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VerificationCodeServiceImpl implements VerificationCodeService {

    @Autowired
    ServiceVerificationCodeRestTemplateService serviceVerificationCodeRestTemplateService;

    @Autowired
    private ServiceSmsRestTemplateService smsRestTemplateService;
    /**
     * 发送验证码
     *
     * @param phoneNumber 手机号
     * @return
     */
    @Override
    public ResponseResult send(String phoneNumber) {

        try {
            ResponseResult responseResult = serviceVerificationCodeRestTemplateService.generatorCode(IdentityConstant.PASSENGER, phoneNumber);
            VerifyCodeResponse verifyCodeResponse = null;
            if(responseResult.getCode() == CommonStatusEnum.SUCCESS.getCode()){
                JSONObject data = JSONObject.fromObject(responseResult.getData());
                verifyCodeResponse = (VerifyCodeResponse)JSONObject.toBean(data, VerifyCodeResponse.class);
            }else{
                return ResponseResult.fail("获取验证码失败");
            }
            //todo 发送短信验证码
            responseResult = smsRestTemplateService.sendSms(phoneNumber, verifyCodeResponse.getCode());
            // log.info("service-sms result:{}",responseResult);
            if(responseResult.getCode() != CommonStatusEnum.SUCCESS.getCode()){
                log.error("api-passenger: 短信发送失败");
                return ResponseResult.fail("短信发送失败");
            }
            return ResponseResult.success("");
        } catch (Exception e) {
            log.error("获取验证码失败, 手机号：{}, 异常：{}", phoneNumber, e.getMessage());
            return ResponseResult.fail("获取验证码失败");
        }
    }

    /**
     * 验证码校验
     *
     * @param phoneNumber
     * @param code
     * @return
     */
    @Override
    public ResponseResult verify(String phoneNumber, String code) {
        return serviceVerificationCodeRestTemplateService.verifyCode(IdentityConstant.PASSENGER, phoneNumber, code);
    }
}

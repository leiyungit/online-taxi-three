package com.msb.apipassenger.service.impl;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.msb.apipassenger.service.ServiceVerificationCodeRestTemplateService;
import com.msb.apipassenger.service.VerificationCodeService;
import com.msb.internalcommon.constant.CommonStatusEnum;
import com.msb.internalcommon.constant.IdentityConstant;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.serviceverificationcode.response.VerifyCodeResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VerificationCodeServiceImpl implements VerificationCodeService {

    @Autowired
    ServiceVerificationCodeRestTemplateService serviceVerificationCodeRestTemplateService;

    /**
     * 发送验证码
     *
     * @param phoneNumber 手机号
     * @return
     */
    @Override
    public ResponseResult send(String phoneNumber) {

        ResponseResult responseResult = serviceVerificationCodeRestTemplateService.generatorCode(IdentityConstant.PASSENGER, phoneNumber);
        VerifyCodeResponse verifyCodeResponse = null;
        if(responseResult.getCode() == CommonStatusEnum.SUCCESS.getCode()){
            JSONObject data = JSONObject.fromObject(responseResult.getData());
            verifyCodeResponse = (VerifyCodeResponse)JSONObject.toBean(data, VerifyCodeResponse.class);
        }else{
            return ResponseResult.fail("获取验证码失败");
        }
        //todo 发送短信验证码
        return ResponseResult.success("");
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

package com.msb.apipassenger.service.impl;

import com.msb.apipassenger.service.ServiceVerificationCodeRestTemplateService;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.serviceverificationcode.request.VerifyCodeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceVerificationCodeRestTemplateServiceImpl implements ServiceVerificationCodeRestTemplateService {

    @Autowired
    RestTemplate restTemplate;
    /**
     * 验证码服务器 - 生成验证码
     *
     * @param identity
     * @param phoneNumber
     * @return
     */
    @Override
    public ResponseResult generatorCode(int identity, String phoneNumber) {
        String url="http://service-verification-code/verify-code/generate/"+identity+"/"+phoneNumber;
        ResponseResult result = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<Object>(null, null), ResponseResult.class).getBody();
        // System.out.println(result);
        return result;
    }

    @Override
    public ResponseResult verifyCode(int identity, String phoneNumber, String code) {
        String url="http://service-verification-code/verify-code/verify";
        VerifyCodeRequest request = new VerifyCodeRequest();
        request.setCode(code);
        request.setIdentity(identity);
        request.setPhoneNumber(phoneNumber);
        ResponseResult result = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<Object>(request, null), ResponseResult.class).getBody();
        // System.out.println(result);
        return result;
    }
}

package com.msb.apipassenger.service;

import com.msb.internalcommon.dto.ResponseResult;

public interface ServiceSmsRestTemplateService {

    /**
     * 短信服务--- 发送短信
     * @param phoneNumber
     * @param code
     * @return
     */
    ResponseResult sendSms(String phoneNumber, String code);
}

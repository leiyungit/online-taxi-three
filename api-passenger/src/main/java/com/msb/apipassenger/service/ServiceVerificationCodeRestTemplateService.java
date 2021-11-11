package com.msb.apipassenger.service;

import com.msb.internalcommon.dto.ResponseResult;

public interface ServiceVerificationCodeRestTemplateService {

    /**
     * 验证码服务器 - 生成验证码
     * @param identity
     * @param phoneNumber
     * @return
     */
    ResponseResult generatorCode(int identity, String phoneNumber);

    ResponseResult verifyCode(int identity, String phoneNumber, String code);
}

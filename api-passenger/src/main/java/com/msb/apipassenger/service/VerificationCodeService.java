package com.msb.apipassenger.service;

import com.msb.internalcommon.dto.ResponseResult;

public interface VerificationCodeService {

    /**
     * 发送验证码
     * @param phoneNumber 手机号
     * @return
     */
    ResponseResult send(String phoneNumber);

    /**
     * 验证码校验
     * @param phoneNumber
     * @param code
     * @return
     */
    ResponseResult verify(String phoneNumber, String code);
}

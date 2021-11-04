package com.msb.serviceverificationcode.service;

import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;

import java.util.Random;

public interface VerifyCodeService {

    /**
     * 生产验6位数验证码
     * @param identity
     * @param phoneNumber
     * @return
     */
    ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber);
}

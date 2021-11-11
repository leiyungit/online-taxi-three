package com.msb.apipassenger.service.impl;

import com.msb.apipassenger.service.AuthService;
import com.msb.apipassenger.service.ServicePassengerUserService;
import com.msb.apipassenger.service.VerificationCodeService;
import com.msb.internalcommon.constant.CommonStatusEnum;
import com.msb.internalcommon.dto.ResponseResult;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    VerificationCodeService verificationCodeService;

    @Autowired
    private ServicePassengerUserService servicePassengerUserService;
    /**
     * @param passengerNumber
     * @param code
     * @return
     */
    @Override
    public ResponseResult auth(String passengerNumber, String code) {

        // 验证码校验
        ResponseResult responseResult = verificationCodeService.verify(passengerNumber, code);
        if (responseResult.getCode() != CommonStatusEnum.SUCCESS.getCode()) {
            return ResponseResult.fail("登录失败：验证码校验错误");
        }
        // 登录
        responseResult = servicePassengerUserService.login(passengerNumber);
        if (responseResult.getCode() != CommonStatusEnum.SUCCESS.getCode()) {
            return ResponseResult.fail("登录失败！");
        }
        return responseResult;
    }
}

package com.msb.serviceverificationcode.controller;

import com.msb.internalcommon.constant.CommonStatusEnum;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;
import com.msb.serviceverificationcode.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {

    @Autowired
    VerifyCodeService verifyCodeService;

    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity") int identity , @PathVariable ("phoneNumber") String phoneNumber){

        return verifyCodeService.generate(identity,phoneNumber);
    }

    @GetMapping("test")
    public Double generate(){

        double random = Math.random();
        return CommonStatusEnum.PHONENUMBER_ERROR.getCode() + random ;
    }
}

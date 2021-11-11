package com.msb.serviceverificationcode.controller;

import com.msb.internalcommon.constant.CommonStatusEnum;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.serviceverificationcode.request.VerifyCodeRequest;
import com.msb.internalcommon.dto.serviceverificationcode.response.VerifyCodeResponse;
import com.msb.serviceverificationcode.service.VerifyCodeService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verify-code")
@Slf4j
public class VerifyCodeController {

    @Autowired
    VerifyCodeService verifyCodeService;

    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity") int identity , @PathVariable ("phoneNumber") String phoneNumber){
        // System.out.println("服务：service-verification-code: 参数："+identity+","+phoneNumber);
        ResponseResult<VerifyCodeResponse> result = verifyCodeService.generate(identity, phoneNumber);
        // System.out.println(result);
        return result;
    }

    @PostMapping("/verify")
    public ResponseResult verify(@RequestBody VerifyCodeRequest request){
        log.info("/verify-code/verify request: {}", JSONObject.fromObject(request));
        int identity = request.getIdentity();
        String phoneNumber = request.getPhoneNumber();
        String code = request.getCode();
        return verifyCodeService.verify(identity,phoneNumber,code);
    }

    @GetMapping("test")
    public Double generate(){

        double random = Math.random();
        return CommonStatusEnum.PHONENUMBER_ERROR.getCode() + random ;
    }
}

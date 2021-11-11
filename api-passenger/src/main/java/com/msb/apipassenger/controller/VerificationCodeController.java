package com.msb.apipassenger.controller;

import com.msb.apipassenger.request.ShortMsgRequest;
import com.msb.apipassenger.request.UserAuthRequest;
import com.msb.apipassenger.service.VerificationCodeService;
import com.msb.internalcommon.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Random;

@RestController
@RequestMapping("/verify-code")
public class VerificationCodeController {

    @Autowired
    VerificationCodeService verificationCodeService;

    @PostMapping("/send")
    public ResponseResult send(@RequestBody @Validated ShortMsgRequest request){
        System.out.println(request);
        return verificationCodeService.send(request.getPhoneNumber());
    }

//    @PostMapping("/verify")
//    public ResponseResult verify(@RequestBody @Validated UserAuthRequest request){
//        System.out.println(request);
//        return verificationCodeService.verify(request.getPassengerPhone(),request.getCode());
//    }

    @GetMapping("/test")
    public Integer test(){
        return new Random().nextInt(100);
    }

    @GetMapping("/test2")
    public Integer test2(@PathParam("phoneNumber") String phoneNumber){
        return new Random().nextInt(100);
    }
}

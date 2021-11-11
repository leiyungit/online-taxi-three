package com.msb.servicepassengeruser.controller;

import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.servicepassengeruser.request.LoginRequest;
import com.msb.servicepassengeruser.service.PassengerUserService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    @Autowired
    private PassengerUserService passengerUserService;

    @RequestMapping("/test")
    public String test(){
        return "service-passenger-user"+new Random().nextInt(100);
    }

    @PostMapping("/login")
    public ResponseResult login(@RequestBody LoginRequest request){
        log.info("/auth/login request:{}", JSONObject.fromObject(request));
        return passengerUserService.login(request.getPassengerPhone());
    }

    @PostMapping("/logout")
    public ResponseResult logout(String token){
        log.info("/auth/logout request:{}", JSONObject.fromObject(token));
        passengerUserService.logout(token);
        return ResponseResult.success("");
    }
}

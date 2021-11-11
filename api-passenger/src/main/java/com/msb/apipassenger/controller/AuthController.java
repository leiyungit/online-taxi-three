package com.msb.apipassenger.controller;

import com.msb.apipassenger.request.UserAuthRequest;
import com.msb.apipassenger.service.AuthService;
import com.msb.internalcommon.dto.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    @Autowired
    AuthService authService;
    @PostMapping("/login")
    public ResponseResult login(@RequestBody @Validated UserAuthRequest request){
        log.info("/auth/login request:{}", JSONObject.fromObject(request));
        String passengerNumber = request.getPassengerPhone();
        String code = request.getCode();
        return authService.auth(passengerNumber, code);
    }
}

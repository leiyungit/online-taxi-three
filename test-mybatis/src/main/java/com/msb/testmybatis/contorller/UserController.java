package com.msb.testmybatis.contorller;

import com.msb.testmybatis.dto.ResponseResult;
import com.msb.testmybatis.service.PassengerUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.map.ListOrderedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private PassengerUserService passengerUserService;

    @RequestMapping("/test")
    public String test(){
        Map<String, String> fieldMap = ListOrderedMap.decorate(new HashMap<String, String>());
        return "test-mybatis"+new Random().nextInt(100);
    }

    @GetMapping("/login")
    public ResponseResult login(){
        return passengerUserService.login("13566667777");
    }

}

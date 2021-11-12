package com.msb.servicesms.controller;

import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.servicesms.request.SmsSendRequest;
import com.msb.servicesms.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
@Slf4j
public class SendController {

    @Autowired
    private SmsService smsService;

    @RequestMapping(value ="/sms-template",method=RequestMethod.POST)
    public ResponseResult send(@RequestBody SmsSendRequest smsSendRequest){
        log.info("/send/sms-template request:{}", JSONObject.fromObject(smsSendRequest));
        return smsService.sendSms(smsSendRequest);
    }
}

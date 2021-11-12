package com.msb.servicesms.service;

import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface SmsService {

    ResponseResult sendSms(SmsSendRequest smsSendRequest);
}

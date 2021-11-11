package com.msb.apipassenger.service;

import com.msb.internalcommon.dto.ResponseResult;

public interface ServicePassengerUserService {

    ResponseResult login(String passengerPhone);
}

package com.msb.servicepassengeruser.service;

import com.msb.internalcommon.dto.ResponseResult;

public interface PassengerUserService {

    ResponseResult login(String passengerPhone);

    ResponseResult logout(String token);
}

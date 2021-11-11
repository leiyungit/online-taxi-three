package com.msb.testmybatis.service;

import com.msb.testmybatis.dto.ResponseResult;

public interface PassengerUserService {

    ResponseResult login(String passengerPhone);

    ResponseResult logout(String token);
}

package com.msb.apipassenger.service;

import com.msb.internalcommon.dto.ResponseResult;

public interface AuthService {
    /**
     *
     * @param passengerNumber
     * @param code
     * @return
     */
    ResponseResult auth(String passengerNumber, String code);
}

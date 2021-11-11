package com.msb.internalcommon.dto.servicepassengeruser.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 全参构造函数
@NoArgsConstructor  // 无参构造函数
public class LoginRequest {

    private String passengerPhone;
}

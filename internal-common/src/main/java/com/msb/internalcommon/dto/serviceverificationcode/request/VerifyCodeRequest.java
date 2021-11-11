package com.msb.internalcommon.dto.serviceverificationcode.request;

import lombok.Data;

/**
 *
 */
@Data
public class VerifyCodeRequest {

    private int identity;

    private String phoneNumber;

    private String code;
}

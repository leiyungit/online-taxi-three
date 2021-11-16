package com.msb.internalcommon.util;

import lombok.Data;

import java.util.Date;

@Data
public class JwtInfo {
    private String subject;
    private Date issueDate;
}

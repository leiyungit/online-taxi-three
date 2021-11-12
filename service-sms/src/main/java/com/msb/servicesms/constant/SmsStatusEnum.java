package com.msb.servicesms.constant;

import lombok.Getter;

public enum SmsStatusEnum {

    /**
     * 操作成功
     */
    SEND_SUCCESS(0,"sms send success"),

    /**
     * 操作异常
     */
    INTERNAL_SERVER_EXCEPTION(-1, "exception"),

    /**
     * 操作失败
     */
    SEND_FIAL(1,"sms send fial");

    @Getter
    private final int code;

    @Getter
    private final String value;

    private SmsStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }
}

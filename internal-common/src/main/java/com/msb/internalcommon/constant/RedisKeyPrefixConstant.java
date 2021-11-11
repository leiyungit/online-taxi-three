package com.msb.internalcommon.constant;

public class RedisKeyPrefixConstant {
    /**
     * 乘客登录验证码 key前缀
     */
    public static final String PASSENGER_LOGIN_CODE_KEY_PRE = "passenger_login_code_";

    /**
     * 乘客登录token key前缀
     */
    public static final String PASSENGER_LOGIN_TOKEN_APP_KEY_PRE = "passenger_login_token_app_";

    public static final String PASSENGER_LOGIN_TOKEN_WEIXIN_KEY_PRE = "passenger_login_token_weixin_";

    /**
     * 司机登录验证码 key前缀
     */
    public static final String DRIVER_LOGIN_CODE_KEY_PRE = "driver_login_code_";

    /**
     * token 登录过期时间（分钟）
     */
    public static final Integer TOKEN_EXPIRE = 30;
}

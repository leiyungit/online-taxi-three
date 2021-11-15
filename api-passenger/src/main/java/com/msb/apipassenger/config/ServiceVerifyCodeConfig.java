package com.msb.apipassenger.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "eureka-service.verify-code")
public class ServiceVerifyCodeConfig {
    /** 服务名. */
    private String serviceName;
    private String http;
    private String methodGenerate;
    private String methodVerify;
}

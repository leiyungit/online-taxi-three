package com.msb.apipassenger.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "eureka-service.sms")
public class ServiceSmsConfig {
    /** 短信发送服务名. */
    private String serviceName;
    private String http;
    private String method;
    private String templateId;
}

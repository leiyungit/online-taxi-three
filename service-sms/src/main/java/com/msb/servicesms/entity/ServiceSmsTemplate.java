package com.msb.servicesms.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信发送模板
 */
@Data
public class ServiceSmsTemplate implements Serializable {

    private static final long serialVersionUID = -972472870211248974L;

    private Integer id;

    /**
     * 短信模板ID
     */
    private String templateId;

    private String templateName;

    /**
     * 模板内容
     */
    private String templateContent;

    /**
     * 模板类型（1：营销；2：通知；3：订单）
     */
    private Boolean templateType;

    private Date createTime;

    private Date updateTime;
}

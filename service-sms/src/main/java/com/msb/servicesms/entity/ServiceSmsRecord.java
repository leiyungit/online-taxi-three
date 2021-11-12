package com.msb.servicesms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信发送记录
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceSmsRecord implements Serializable {

    private static final long serialVersionUID = -7719764142168708247L;

    private Integer id;

    /**
     * 乘客手机号
     */
    private String phoneNumber;

    /**
     * 短信内容
     */
    private String smsContent;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 操作人
     */
    private String operatorName;

    /**
     * 发送状态 0:失败  1: 成功
     */
    private Integer sendFlag;

    /**
     * 发送失败次数
     */
    private Integer sendNumber;

    private Date createTime;

    private Date updateTime;
}

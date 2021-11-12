package com.msb.internalcommon.dto.servicesms;

import lombok.Data;

import java.util.Map;

@Data
public class SmsTemplateDto {
    /**
     * 模板id
     */
    private String id;

    /**
     * 参数  占位符
     * code,123456
     * str, test
     */
    private Map<String,Object> templateMap;

    @Override
    public String toString() {
        return "SmsTemplateDto [id=" + id + ", templateMap=" + templateMap + "]";
    }
}

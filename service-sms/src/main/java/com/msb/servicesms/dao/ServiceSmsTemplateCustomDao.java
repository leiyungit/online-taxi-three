package com.msb.servicesms.dao;

import com.msb.servicesms.entity.ServiceSmsTemplate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServiceSmsTemplateCustomDao extends ServiceSmsTemplateDao {

    /**
     * 根据模板id查询模板
     * @param templateId 模板id
     * @return
     */
    ServiceSmsTemplate selectByTemplateId(String templateId);

}

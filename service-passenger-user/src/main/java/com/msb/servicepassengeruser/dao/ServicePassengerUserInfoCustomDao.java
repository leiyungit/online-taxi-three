package com.msb.servicepassengeruser.dao;

import com.msb.servicepassengeruser.entity.ServicePassengerUserInfo;
import org.apache.ibatis.annotations.Mapper;
// import org.springframework.stereotype.Component;

@Mapper
public interface ServicePassengerUserInfoCustomDao extends ServicePassengerUserInfoDao {
    /**
     * 根据手机号查询乘客信息
     * @param passengerPhone
     * @return
     */
    ServicePassengerUserInfo selectByPhoneNumber(String passengerPhone);
}

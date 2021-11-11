package com.msb.testmybatis.dao;

import com.msb.testmybatis.entity.ServicePassengerUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Repository
@Mapper
public interface ServicePassengerUserInfoMapper {
    /**
     * 根据手机号查询乘客信息
     * @param passengerPhone
     * @return
     */
    public ServicePassengerUserInfo selectByPhoneNumber(String passengerPhone);

    List<ServicePassengerUserInfo> fandAllUser();

}

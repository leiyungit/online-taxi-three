package com.msb.testmybatis.service.Impl;

import com.msb.testmybatis.dto.ResponseResult;
import com.msb.testmybatis.dao.ServicePassengerUserInfoMapper;
import com.msb.testmybatis.entity.ServicePassengerUserInfo;
import com.msb.testmybatis.service.PassengerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerUserServiceImpl implements PassengerUserService {

    @Autowired
    private ServicePassengerUserInfoMapper userInfoDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public ResponseResult login(String passengerPhone) {

        List<ServicePassengerUserInfo> servicePassengerUserInfos = userInfoDao.fandAllUser();
        // ServicePassengerUserInfo passengerUserInfo = userInfoDao.selectByPhoneNumber(passengerPhone);
        System.out.println(servicePassengerUserInfos);
        return ResponseResult.success(servicePassengerUserInfos);
    }

    @Override
    public ResponseResult logout(String passengerId) {
        // 存到过期的redis中。
        setExpireToken(passengerId);
        return ResponseResult.success("");
    }

    private void setExpireToken(String passengerId){
//        String key = RedisKeyPrefixConstant.PASSENGER_LOGIN_TOKEN_APP_KEY_PRE+passengerId;
//        redisTemplate.delete(key);
    }
}

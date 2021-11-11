package com.msb.servicepassengeruser.service.Impl;

import com.msb.internalcommon.constant.RedisKeyPrefixConstant;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.util.JwtUtil;
import com.msb.servicepassengeruser.dao.ServicePassengerUserInfoCustomDao;
import com.msb.servicepassengeruser.entity.ServicePassengerUserInfo;
import com.msb.servicepassengeruser.service.PassengerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Service
public class PassengerUserServiceImpl implements PassengerUserService {

    @Autowired
    private ServicePassengerUserInfoCustomDao userInfoCustomDao;

//    @Autowired
//    private ServicePassengerUserInfoDao userInfoDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public ResponseResult login(String passengerPhone) {

        ServicePassengerUserInfo passengerUserInfo = userInfoCustomDao.selectByPhoneNumber(passengerPhone);
        // ServicePassengerUserInfo passengerUserInfo;
        if(passengerUserInfo != null){

        }else{
            passengerUserInfo = new ServicePassengerUserInfo();
            passengerUserInfo.setPassengerPhone(passengerPhone);
            passengerUserInfo.setPassengerGender((byte)1);
            passengerUserInfo.setPassengerName("");
            passengerUserInfo.setRegisterDate(new Date());
            passengerUserInfo.setUserState((byte)1);
            userInfoCustomDao.insertSelective(passengerUserInfo);
        }
        // 生成token
        String token = JwtUtil.createToken(passengerUserInfo.getId().toString(), new Date());

        // 存reids
        String keyPre = RedisKeyPrefixConstant.PASSENGER_LOGIN_TOKEN_APP_KEY_PRE+ passengerUserInfo.getId();
        BoundValueOperations boundValueOperations = redisTemplate.boundValueOps(keyPre);
        boundValueOperations.set(token, RedisKeyPrefixConstant.TOKEN_EXPIRE, TimeUnit.MINUTES);
        return ResponseResult.success(token);
    }

    @Override
    public ResponseResult logout(String passengerId) {
        // 存到过期的redis中。
        setExpireToken(passengerId);
        return ResponseResult.success("");
    }

    private void setExpireToken(String passengerId){
        String key = RedisKeyPrefixConstant.PASSENGER_LOGIN_TOKEN_APP_KEY_PRE+passengerId;
        redisTemplate.delete(key);
    }
}

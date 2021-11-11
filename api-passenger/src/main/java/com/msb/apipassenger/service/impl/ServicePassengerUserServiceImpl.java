package com.msb.apipassenger.service.impl;

import com.msb.apipassenger.service.ServicePassengerUserService;
import com.msb.internalcommon.dto.ResponseResult;
import com.msb.internalcommon.dto.servicepassengeruser.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicePassengerUserServiceImpl implements ServicePassengerUserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseResult login(String passengerPhone) {
        String url="http://service-passenger-user/auth/login";
        LoginRequest request = new LoginRequest(passengerPhone);
        ResponseResult result = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<Object>(request, null), ResponseResult.class).getBody();
        return result;
    }
}

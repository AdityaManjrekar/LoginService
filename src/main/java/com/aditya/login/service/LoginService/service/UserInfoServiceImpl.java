package com.aditya.login.service.LoginService.service;

import com.aditya.login.service.LoginService.model.UserInfo;
import com.aditya.login.service.LoginService.repository.UserInfoRepository;
import com.aditya.login.service.LoginService.util.UUIDGenerator;
import org.apache.tinkerpop.shaded.jackson.annotation.ObjectIdGenerators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.UUID;


@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    UserInfoRepository userInfoRepository;
    @Override
    public UserInfo saveUser(UserInfo userInfo) {
        UUID timeuuid = UUIDGenerator.generateType1UUID();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        userInfo.setId(timeuuid);
        userInfo.setCreationDate(timestamp);
        userInfo.setLastLogin(timestamp);
        userInfoRepository.save(userInfo);
        return userInfo;
    }
}

package com.aditya.login.service.LoginService.resource;

import com.aditya.login.service.LoginService.model.UserInfo;
import com.aditya.login.service.LoginService.repository.UserInfoRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoResource implements GraphQLQueryResolver {

    @Autowired
    UserInfoRepository userInfoRepository;

    public UserInfo getUserInfoByID(String id){
        return userInfoRepository.findById(Long.parseLong(id)).get();
    }
}

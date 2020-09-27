package com.aditya.login.service.LoginService.resource;

import com.aditya.login.service.LoginService.model.UserInfo;
import com.aditya.login.service.LoginService.repository.UserInfoRepository;
import com.aditya.login.service.LoginService.service.UserInfoService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoMutationResolverResource implements GraphQLMutationResolver {

    @Autowired
    UserInfoService userInfoService;

    public UserInfo saveUserInfo(UserInfo userInfo){
        return userInfoService.saveUser(userInfo);
    }
}

package com.aditya.login.service.LoginService.repository;

import com.aditya.login.service.LoginService.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {



}

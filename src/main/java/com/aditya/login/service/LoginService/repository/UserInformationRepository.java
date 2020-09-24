package com.aditya.login.service.LoginService.repository;

import com.aditya.login.service.LoginService.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInformationRepository extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);

}

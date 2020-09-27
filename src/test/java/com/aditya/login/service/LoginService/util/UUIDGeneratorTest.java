package com.aditya.login.service.LoginService.util;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(JUnit4.class)
public class UUIDGeneratorTest {

    UUIDGenerator uuidGenerator;

    @Before
    public void init(){
        uuidGenerator = new UUIDGenerator();
    }



}

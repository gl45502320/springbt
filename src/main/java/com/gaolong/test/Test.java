package com.gaolong.test;

import com.gaolong.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main1(String[] args) {

        ApplicationContext app = SpringApplication.run(Test.class, args);
         UserService userService = (UserService) app.getBean("userServiceImpl");
    }
}

package com.universedust.jpa;

import com.universedust.jpa.controller.UserController;
import com.universedust.jpa.entity.User;
import jakarta.annotation.Resource;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


/**
 * 演示数据
 */
@Component
public class InitData implements ApplicationRunner {

    @Resource
    UserController userController;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setAge(i);
            user.setUsername("mock" + i);
            userController.register(user);
        }
    }
}

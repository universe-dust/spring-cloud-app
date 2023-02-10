package com.universedust.jpa.controller;

import com.universedust.jpa.entity.User;
import com.universedust.jpa.repositroy.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Resource
    UserRepository userRepository;



    @GetMapping("/list")
    public List<User> listUser(){
        return userRepository.findAll();
    }

    @PostMapping("/save")
    public User register(User user){
       return userRepository.save(user);
    }
}

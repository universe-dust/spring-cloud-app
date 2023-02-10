package com.universedust.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String t1(){
        System.out.println("test ok");
        return "test ok";
    }

}

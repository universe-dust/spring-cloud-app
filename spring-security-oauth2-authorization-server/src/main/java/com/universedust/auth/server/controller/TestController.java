package com.universedust.auth.server.controller;

import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TestController {

    @GetMapping("/")
    public String getTime(){
        return LocalTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}

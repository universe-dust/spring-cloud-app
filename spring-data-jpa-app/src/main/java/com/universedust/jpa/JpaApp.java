package com.universedust.jpa;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@Slf4j
@SpringBootApplication
public class JpaApp {

    public static void main(String[] args) {
        SpringApplication.run(JpaApp.class,args);
        log.info("******************************");
        log.info("******************************");
        log.info("******************************");
        log.info("JPA服务启动");
    }
}


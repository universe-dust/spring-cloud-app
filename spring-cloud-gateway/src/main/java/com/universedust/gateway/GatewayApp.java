package com.universedust.gateway;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
        log.info("*********************************");
        log.info("*********************************");
        log.info("*********************************");
        log.info("网关服务启动");
    }
}

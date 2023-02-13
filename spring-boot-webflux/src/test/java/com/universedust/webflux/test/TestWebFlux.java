package com.universedust.webflux.test;

import com.universedust.webflux.controller.TestController;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import reactor.core.publisher.Mono;

public class TestWebFlux {

    @Before
//    @BeforeEach
//    @BeforeAll
    public void before(){
        System.out.println("Webflux单元测试>>>>>>>>>>");
    }

    @After
    public void after(){
        System.out.println("Webflux单元测试<<<<<<<<<<");
    }

    @org.junit.Test
    public void t1(){
        System.out.println("webflux测试");

        Assertions.assertEquals(Mono.just("Webflux接口").block(),new TestController().t1().block());
    }
}

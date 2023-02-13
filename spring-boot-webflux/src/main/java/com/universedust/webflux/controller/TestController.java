package com.universedust.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/test")
    public Mono<String> t1() {
        System.out.println("webflux接口");
        return Mono.just("Webflux接口");
    }

    @GetMapping("/list")
    public Flux<List<String>> t2() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("element" + i * 10);

        }
        return Flux.just(list);
    }

}

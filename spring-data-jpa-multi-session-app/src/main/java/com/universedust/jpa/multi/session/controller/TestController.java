package com.universedust.jpa.multi.session.controller;

import com.universedust.jpa.multi.session.db1.rep01.HumanRepository;
import com.universedust.jpa.multi.session.db2.rep02.AnimalRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
public class TestController {


    @Resource
    HumanRepository humanRepository;

    @Resource
    AnimalRepository animalRepository;


    @GetMapping("/test/{id}")
    public List<? extends Serializable> t1(@PathVariable Integer id) {
        if (id == 1) {
            System.out.println("human");
            return humanRepository.findAll();
        } else {
            System.out.println("anmial");
            return animalRepository.findAll();
        }
    }
}

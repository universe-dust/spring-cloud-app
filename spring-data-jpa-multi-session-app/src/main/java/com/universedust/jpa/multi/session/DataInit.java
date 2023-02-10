package com.universedust.jpa.multi.session;

import com.universedust.jpa.multi.session.db1.entity.Human;
import com.universedust.jpa.multi.session.db1.rep01.HumanRepository;
import com.universedust.jpa.multi.session.db2.entity.Animal;
import com.universedust.jpa.multi.session.db2.rep02.AnimalRepository;
import jakarta.annotation.Resource;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataInit implements ApplicationRunner {
    @Resource
    HumanRepository humanRepository;

    @Resource
    AnimalRepository animalRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i < 20; i++) {
            Human human = new Human();
            human.setAge(i);
            human.setUsername("张三" + i);
            humanRepository.save(human);

            Animal animal = new Animal();
            animal.setAnimalName("dog" + i);
            animalRepository.save(animal);
        }
    }
}

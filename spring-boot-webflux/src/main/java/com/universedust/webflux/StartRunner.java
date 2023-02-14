package com.universedust.webflux;

import com.universedust.webflux.entity.ReactUser;
import com.universedust.webflux.repository.ReactUserRepository;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Component;

@Component
public class StartRunner implements CommandLineRunner {


    @Resource
    ReactUserRepository repository;

    @Override
    public void run(String... args) throws Exception {

//        ConnectionFactory connectionFactory = ConnectionFactories.get("r2dbc:h2:mem:///test?options=DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//
//
//        R2dbcEntityTemplate template = new R2dbcEntityTemplate(connectionFactory);
//
//        template.getDatabaseClient().sql("CREATE TABLE person" +
//                        "(id VARCHAR(255) PRIMARY KEY," +
//                        "name VARCHAR(255)," +
//                        "age INT)")
//                .fetch()
//                .rowsUpdated()
//                .as(StepVerifier::create)
//                .expectNextCount(1)
//                .verifyComplete();



        System.out.println("开始初始化数据>>>>>>>>>>>>");
        for (int i = 0; i < 20; i++) {
            ReactUser reactUser = new ReactUser();
            reactUser.setId(i + 1L);
            reactUser.setUsername("react用户" + i * 10);
            var r = repository.save(reactUser);
            System.out.println(r.block());
        }
        System.out.println("开始初始化数据>>>>>>>>>>>>");


    }
}

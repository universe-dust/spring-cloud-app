package com.universedust.jpa.multi.session.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class MulitDataSourceConfig {

    @Primary
    @Qualifier("primaryDataSource")
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primary(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource secondary(){
        return DataSourceBuilder.create().build();
    }

}

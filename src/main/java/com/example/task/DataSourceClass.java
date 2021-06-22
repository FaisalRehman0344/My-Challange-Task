package com.example.task;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceClass {
	@Bean
    public DataSource getDataSource(){
        return  DataSourceBuilder
                .create()
                .url("jdbc:mysql://localhost:3306/test")
                .username("root")
                .password("faisal12345")
                .build();
    }

}

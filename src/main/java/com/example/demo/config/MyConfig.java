package com.example.demo.config;

import com.example.demo.bean.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfig {

    @Bean
    public Test test(){
        System.out.println("----test");
        return new Test();
    }
}

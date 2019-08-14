package com.example.demo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * 注册监听bean
 */
@Configuration
public class ListenerConfig {
    @Bean
    public ApplicationStartup applicationStartup(){
        return new ApplicationStartup();
    }
}

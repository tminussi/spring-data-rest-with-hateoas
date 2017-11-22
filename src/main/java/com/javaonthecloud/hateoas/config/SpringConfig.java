package com.javaonthecloud.hateoas.config;

import com.javaonthecloud.hateoas.handler.CustomerEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public CustomerEventHandler customerValidator() {
        return new CustomerEventHandler();
    }

}

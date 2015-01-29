package com.enlightendev.spring.security.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainResourceApp {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = SpringApplication.run(MainResourceApp.class, args);

    }
}

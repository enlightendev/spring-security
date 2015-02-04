package com.enlightendev.spring.security.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 */
@SpringBootApplication
public class BasicHttpSecurityApplication {


    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = SpringApplication.run(BasicHttpSecurityApplication.class, args);


    }
}

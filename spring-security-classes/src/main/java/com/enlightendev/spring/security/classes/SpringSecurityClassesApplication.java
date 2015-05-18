package com.enlightendev.spring.security.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 */
@SpringBootApplication
public class SpringSecurityClassesApplication {


    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = SpringApplication.run(SpringSecurityClassesApplication.class, args);


    }
}

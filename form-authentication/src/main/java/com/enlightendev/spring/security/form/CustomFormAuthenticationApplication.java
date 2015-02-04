package com.enlightendev.spring.security.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 */
@SpringBootApplication
public class CustomFormAuthenticationApplication {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = SpringApplication.run(CustomFormAuthenticationApplication.class, args);

    }
}

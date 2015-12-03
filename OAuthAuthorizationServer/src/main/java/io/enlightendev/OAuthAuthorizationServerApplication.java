package io.enlightendev;

import io.enlightendev.oauthserver.bootstrap.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OAuthAuthorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuthAuthorizationServerApplication.class, args);
    }

    @Bean
    public StartupRunner startupRunner(){
        return new StartupRunner();
    }
}
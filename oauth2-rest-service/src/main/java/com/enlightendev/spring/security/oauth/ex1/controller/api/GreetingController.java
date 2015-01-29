package com.enlightendev.spring.security.oauth.ex1.controller.api;

import com.enlightendev.spring.security.oauth.ex1.domain.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * a simple rest controller
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@AuthenticationPrincipal User user) {
        return new Greeting(counter.incrementAndGet(), String.format(template, user.getName()));
    }
}

package com.enlightendev.spring.security.classes.security;

import com.enlightendev.spring.security.classes.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LoggedInChecker {
    public User getLoggedInUser() {
        User user = null;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();

            // principal can be "anonymousUser" (String)
            if (principal instanceof CustomUserDetails) {
                CustomUserDetails userDetails = (CustomUserDetails) principal;
                user = userDetails.getUser();
            }
        }

        return user;
    }
}
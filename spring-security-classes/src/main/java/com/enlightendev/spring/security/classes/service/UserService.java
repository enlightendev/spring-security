package com.enlightendev.spring.security.classes.service;

import com.enlightendev.spring.security.classes.model.User;

import java.util.List;

public interface UserService {

    User getUserByUsername(String username);

    List<String> getPermissions(String username);

    Boolean isCurrentUserLoggedIn();
}

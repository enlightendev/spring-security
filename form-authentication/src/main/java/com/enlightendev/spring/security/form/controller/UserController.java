package com.enlightendev.spring.security.form.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 *
 */
@RestController
public class UserController {

    /**
     * angular checks to see if user is logged in by making a get request to this endpoint.
     * if json object is returned user is looged in, otherwise data = html for login page.
     *
     * $http.get('api/user').success(function (data) {
            if (data.name) {
            $rootScope.authenticated = true;
        } else {

     * @param user
     * @return
     */
    @RequestMapping("/api/user")
    public Principal user(Principal user) {
        return user;
    }
}

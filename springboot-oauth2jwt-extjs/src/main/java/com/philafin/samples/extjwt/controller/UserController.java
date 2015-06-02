package com.philafin.samples.extjwt.controller;

import com.philafin.samples.extjwt.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @RequestMapping("list")
    public List<User> list() {
        return Arrays.asList(new User("Dhoni", "Mahendra", "msd@gmail.com"), new User("Tendulkar", "Sachin", "sachin@gmail.com"));
    }

}

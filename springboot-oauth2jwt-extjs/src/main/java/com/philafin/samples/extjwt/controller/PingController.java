package com.philafin.samples.extjwt.controller;

import com.philafin.samples.extjwt.Application;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
public class PingController {
    @RequestMapping(value = {"/", "/ping"})
    @ResponseBody
    public String ping() {
        return MessageFormat.format("Server started at {0}", Application.startTime);
    }
}
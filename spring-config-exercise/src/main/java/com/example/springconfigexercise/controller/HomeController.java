package com.example.springconfigexercise.controller;

import com.example.springconfigexercise.model.MyAppConfig;
import com.example.springconfigexercise.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // no need for @Autowired, still achieve constructor based injection
public class HomeController {

    private final AppService appService;
    private final MyAppConfig myAppConfig;

    @Value("${myappconfig.app-name}")
    private String appName;

    @GetMapping
    public String home() {
        return myAppConfig.toString();
    }

    @GetMapping(path="/value")
    public String value() {
        return appName;
    }

    @GetMapping(path="/message")
    public String message() {
        return appService.getMessage();
    }

}

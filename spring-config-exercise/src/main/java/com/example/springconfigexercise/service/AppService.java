package com.example.springconfigexercise.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public String getMessage() {
        return "Hello from App Service!";
    }

}

package com.example.springconfigexercise.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="myappconfig")
public class MyAppConfig {

    //@Value("${myappconfig.app-name}")
    private String appName;

    //@Value("${myappconfig.app-description}")
    private String appDescription;

}

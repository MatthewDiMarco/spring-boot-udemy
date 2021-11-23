package com.example.springconfigexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringConfigExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringConfigExerciseApplication.class, args);
	}

}

package com.personal.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;

@SpringBootApplication
public class SpingPropertiesDemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		SpringApplication.run(SpingPropertiesDemoApplication.class, args);
	}
	

}

package com.personal.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.spring.boot.dto.MicroResponse;

@RestController
@RequestMapping("/env")
public class EnvironmentController {
	
	@Value("${environment}")
	private String environment;

	@GetMapping
	public MicroResponse getEnvironment() {
		System.out.println("environment===="+environment);
		return MicroResponse.builder().environment(environment).build();
		
	}
	
	
}

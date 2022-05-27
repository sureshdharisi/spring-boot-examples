package com.spring.cloud.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.poc.configuration.LimitsConfig;
import com.spring.cloud.poc.dto.LimitsResponse;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitsConfig config;

	@GetMapping("/limits")
	public LimitsResponse retriveLimits() {
		return LimitsResponse.builder().maximum(config.getMaximum()).minimum(config.getMinimum()).build();
	}
}

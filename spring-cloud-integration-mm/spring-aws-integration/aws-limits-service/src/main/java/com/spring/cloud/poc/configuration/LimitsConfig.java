package com.spring.cloud.poc.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("limits-service")
@Setter
@Getter
public class LimitsConfig {
	
	private int minimum;
	
	private int maximum;

}

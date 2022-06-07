package com.spring.cloud.poc.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LimitsResponse {

	private int minimum;
	
	private int maximum;
}

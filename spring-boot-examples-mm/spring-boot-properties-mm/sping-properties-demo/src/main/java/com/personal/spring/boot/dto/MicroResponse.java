package com.personal.spring.boot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class MicroResponse {

	private String environment;
}

package com.poc.spring.boot.currency.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudCurrencyConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCurrencyConverterApplication.class, args);
	}

}

package com.poc.spring.boot.currency.exchange.service;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.poc.spring.boot.currency.exchange.dto.CurrencyExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		return CurrencyExchangeValue.builder().from(from).to(to).conversionMultiple(BigDecimal.valueOf(65)).id(1000L).build();
	}

}

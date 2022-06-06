package com.poc.spring.boot.currency.converter.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.poc.spring.boot.currency.converter.dto.CurrenctyConversionBean;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyExchangeClient {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrenctyConversionBean getConvertedValue(@PathVariable("from") String from, @PathVariable("to") String to);

}

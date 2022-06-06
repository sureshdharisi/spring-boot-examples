package com.poc.spring.boot.currency.converter.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.poc.spring.boot.currency.converter.dto.CurrenctyConversionBean;
import com.poc.spring.boot.currency.converter.service.CurrencyExchangeClient;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeClient exchangeClient;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrenctyConversionBean getConvertedValue(@PathVariable String from, @PathVariable String to,@PathVariable Integer quantity) {
		
		
		CurrenctyConversionBean exchangeValue=exchangeClient.getConvertedValue(from, to);
		
		return CurrenctyConversionBean.builder().from(from).to(to).quantity(quantity).
				conversionMultiple(exchangeValue.getConversionMultiple()).
				calculatedAmount(BigDecimal.valueOf(quantity).multiply(exchangeValue.getConversionMultiple()))
						.build();
	}
	
	
	@GetMapping("/currency-converter-old/from/{from}/to/{to}/quantity/{quantity}")
	public CurrenctyConversionBean getConvertedValueWithTemplate(@PathVariable String from, @PathVariable String to,@PathVariable Integer quantity) {
		
		Map<String, String> uriVariables=new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrenctyConversionBean> exchangeValueResponse= new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
				CurrenctyConversionBean.class,uriVariables);
		
		
		CurrenctyConversionBean exchangeValue=exchangeValueResponse.getBody();
		
		return CurrenctyConversionBean.builder().from(from).to(to).quantity(quantity).
				conversionMultiple(exchangeValue.getConversionMultiple()).
				calculatedAmount(BigDecimal.valueOf(quantity).multiply(exchangeValue.getConversionMultiple()))
						.build();
	}
}

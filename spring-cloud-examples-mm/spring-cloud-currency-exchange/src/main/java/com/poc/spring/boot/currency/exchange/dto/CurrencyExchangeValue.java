package com.poc.spring.boot.currency.exchange.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class CurrencyExchangeValue {

	private String from;
	
	private String to;
	
	private Long id;
	
	private BigDecimal conversionMultiple;
	
	private Integer port;
	
}

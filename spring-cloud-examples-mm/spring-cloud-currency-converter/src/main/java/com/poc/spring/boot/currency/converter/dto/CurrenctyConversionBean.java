package com.poc.spring.boot.currency.converter.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CurrenctyConversionBean {
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private Integer quantity;
	
	private BigDecimal calculatedAmount;
	
	private int port;
	

}

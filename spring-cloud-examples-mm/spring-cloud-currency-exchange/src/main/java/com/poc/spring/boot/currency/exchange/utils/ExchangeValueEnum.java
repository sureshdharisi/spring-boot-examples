package com.poc.spring.boot.currency.exchange.utils;

import java.math.BigDecimal;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExchangeValueEnum {
	
	USD_INR("USD","INR",BigDecimal.valueOf(65.0));
	
	private String from;
	
	private String to;
	
	private BigDecimal exchangeValue;
	
	public static  BigDecimal findExchangeFalue(String from,String to) {
		return Stream.of(values()).filter(value->value.from.equalsIgnoreCase(from)).filter(value->value.to.equalsIgnoreCase(to)).findFirst().get().exchangeValue;
	}

}

package com.poc.spring.boot.gateway.server.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiRoutesConfig {
	
	@Bean
	public RouteLocator getewayRouter(RouteLocatorBuilder builder) {
		return builder.routes().route(rt->rt.path("/get")
				.filters(f->f.addRequestHeader("MyHeader", "MyURI"))
				.uri("http://httpbin.org:80"))
				.route(rt->rt.path("/currency-converter/**")
						.uri("lb://currency-conversion-service"))
				.route(rt->rt.path("/currency-exchange/**")
						.uri("lb://currency-exchange-service")).build();
	}

}

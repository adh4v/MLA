package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class OrderConfig {
	@Bean
	public static Order getOrder()
	{
		return new Order(0, null, 0);
	}
}

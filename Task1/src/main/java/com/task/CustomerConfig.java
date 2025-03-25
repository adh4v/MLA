package com.task;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	@Bean
	public static Customer getCus()
	{
		return new Customer();
	}
	
}

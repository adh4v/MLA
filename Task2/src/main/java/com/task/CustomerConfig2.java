package com.task;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig2 {
	
	@Bean
	public static CustomerType2 getCust()
	{
		return new CustomerType2(101, "Adhav", "Regular", "Cbe", 17);
		
	}
}

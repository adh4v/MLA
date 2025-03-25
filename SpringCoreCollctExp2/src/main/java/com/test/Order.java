package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public record Order(int id, String name, int price) {
	
	public static Order getOrder()
	{
		return new Order(10,"Adhav",50);
	}
	
}

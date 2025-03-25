package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

public class TestDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Order.class);
		
		Order o = ctx.getBean("getOrder",Order.class);
		System.out.println(o);
		
	}
}

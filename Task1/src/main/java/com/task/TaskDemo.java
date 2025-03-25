package com.task;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskDemo {
	
	public static void main(String[] args) {
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//Customer c = (Customer)ctx.getBean("cust",Customer.class);
		
		//System.out.println(c);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CustomerConfig.class);
		
		Customer c = ctx.getBean("getCus",Customer.class);
		c.setId(102);
		c.setName("Adhav");
		List<String> t = Arrays.asList("Temp","Regular");
		c.setType(t);
		c.setCity("Erode");
		c.setPin(12929);
		System.out.println(c);
		
		
		
		
	}
}

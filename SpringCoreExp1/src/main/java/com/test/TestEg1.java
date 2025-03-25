package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEg1 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//Employee e = (Employee)ctx.getBean("emp");
		
		//ctx.getBean("emp",Employee.class);
		//System.out.println(e);
		
		Employee e = ctx.getBean("emp",Employee.class);
		System.out.println(e.getAdr());
		
		
	}
}

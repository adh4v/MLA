package com.task;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
	
	public static void main(String[] args) {
		
//			ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		
//			CustomerType2 c = (CustomerType2)ctx.getBean("cust",CustomerType2.class);
//				
//			System.out.println(c);
				
			//ApplicationContext ctx = new AnnotationConfigApplicationContext(CustomerConfig2.class);
				
			//CustomerType2 c = ctx.getBean("getCust",CustomerType2.class);
			//System.out.println(c);
			CustomerConfig2 c1 = new CustomerConfig2();
			CustomerConfig2 c2 = new CustomerConfig2();
			c1 = c2;
			c1 = new CustomerConfig2();
			
				
	}
}

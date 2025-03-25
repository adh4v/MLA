package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student std = ctx.getBean("getStud1",Student.class);
		 std.setId(2);
		 std.setName("Shiv");
		 List<String> skills = Arrays.asList("python","java");
		 std.setSkills(skills);
		 System.out.println(std);
	}
}

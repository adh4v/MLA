package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;

@RestController
public class HelloWorldActuator {
	User u = new User();
	@Value("${name.fname")
	private String fname;
	@Value("${email.email")
	private String email;
	@Value("${desg.desg")
	private String desg;
	@GetMapping("/test")
	public String testActuator()
	{
		u.setFname(fname);
		u.setEmail(email);
		u.setDesg(desg);
		return "Hello"+u;
	}
}

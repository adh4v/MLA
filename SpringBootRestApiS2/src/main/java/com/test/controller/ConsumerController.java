package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
	@GetMapping("/consumer2")
	public String consumerService()
	{
		return "Consumer Controller Response"; 
	}
}

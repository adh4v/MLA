package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroService1Application.class, args);
	}

}

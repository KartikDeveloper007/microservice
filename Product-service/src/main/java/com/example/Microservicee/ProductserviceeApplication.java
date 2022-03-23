package com.example.Microservicee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductserviceeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceeApplication.class, args);
	}

}

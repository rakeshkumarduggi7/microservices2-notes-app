package com.microsservices2.Microservices2_apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservices2ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservices2ApigatewayApplication.class, args);
	}

}

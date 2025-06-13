package com.microsservices2.Microservices2_userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Microservices2UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservices2UserserviceApplication.class, args);
	}

}

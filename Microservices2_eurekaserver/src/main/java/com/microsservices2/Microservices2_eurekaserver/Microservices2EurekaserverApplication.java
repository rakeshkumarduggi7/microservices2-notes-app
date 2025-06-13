package com.microsservices2.Microservices2_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservices2EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservices2EurekaserverApplication.class, args);
	}

}

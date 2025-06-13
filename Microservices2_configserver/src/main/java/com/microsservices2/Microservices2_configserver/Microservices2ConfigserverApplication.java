package com.microsservices2.Microservices2_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microservices2ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservices2ConfigserverApplication.class, args);
	}

}

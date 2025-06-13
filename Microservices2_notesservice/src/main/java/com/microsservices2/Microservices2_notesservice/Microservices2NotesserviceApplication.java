package com.microsservices2.Microservices2_notesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservices2NotesserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservices2NotesserviceApplication.class, args);
	}

}

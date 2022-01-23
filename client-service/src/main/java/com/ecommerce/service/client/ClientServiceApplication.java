package com.ecommerce.service.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientServiceApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientServiceApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Going to Start Account Service");
		SpringApplication.run(ClientServiceApplication.class, args);
	}

}

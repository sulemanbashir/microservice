package com.ecommerce.service.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class AccountServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Going to Start Account Service");
		SpringApplication.run(AccountServiceApplication.class, args);
	}

}

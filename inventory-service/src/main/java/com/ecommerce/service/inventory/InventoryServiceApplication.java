package com.ecommerce.service.inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class InventoryServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(InventoryServiceApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Going to Start Inventory Service");
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}

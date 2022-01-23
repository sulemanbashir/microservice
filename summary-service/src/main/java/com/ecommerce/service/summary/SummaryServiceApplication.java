package com.ecommerce.service.summary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SummaryServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SummaryServiceApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Going to Start Summary Service");
		SpringApplication.run(SummaryServiceApplication.class, args);
	}

}

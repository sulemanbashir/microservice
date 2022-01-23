package com.ecommerce.service.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class CloudConfigServerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CloudConfigServerApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Going to Start Cloud Service");
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}

}

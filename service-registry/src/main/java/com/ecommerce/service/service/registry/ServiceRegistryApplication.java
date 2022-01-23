package com.ecommerce.service.service.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRegistryApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Going to Start Service Registry");
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
	
	@EventListener({EnvironmentChangeEvent.class})
	public void onRefresh() {
		System.out.println("environment Changed..");
	}

}

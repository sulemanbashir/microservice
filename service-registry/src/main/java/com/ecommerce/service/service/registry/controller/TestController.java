package com.ecommerce.service.service.registry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.service.registry.beans.AppConfig;

@RestController
public class TestController implements ApplicationListener<EnvironmentChangeEvent> {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private AppConfig appConfig;
	
	@RequestMapping(path = "/config", method = RequestMethod.GET)
	public AppConfig printConfig() {
		return appConfig;
	}

	@Override
	public void onApplicationEvent(EnvironmentChangeEvent event) {
		
		if(event.getKeys().contains("prop1")) {
			LOGGER.info("prop1 is updated: " + appConfig.getProp1());
		}
	}
}
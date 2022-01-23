package com.ecommerce.service.service.registry.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ConfigRefreshRemoteApplicationEvent implements ApplicationListener<RefreshRemoteApplicationEvent> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigRefreshRemoteApplicationEvent.class);
	@Autowired
	Environment env;
	
	/*
	 * RefreshRemoteApplicationEvent is catched before refreshment of environment.
	 * So here the old value of prop4 is printed.
	 */
	@Override
	public void onApplicationEvent(RefreshRemoteApplicationEvent event) {
		LOGGER.info("prop1 from env: " + env.getProperty("prop1"));
	}

}

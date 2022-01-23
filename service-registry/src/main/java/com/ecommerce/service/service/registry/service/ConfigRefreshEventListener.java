package com.ecommerce.service.service.registry.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;


@Service
public class ConfigRefreshEventListener implements ApplicationListener<RefreshScopeRefreshedEvent> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigRefreshEventListener.class);
	@Override
	public void onApplicationEvent(RefreshScopeRefreshedEvent event) {
		LOGGER.info("configuration refresh is called..");
	}

}

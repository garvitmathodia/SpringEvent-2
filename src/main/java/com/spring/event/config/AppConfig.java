package com.spring.event.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {

	@Bean("applicationEventMulticaster")
	public ApplicationEventMulticaster makeItAsync() {
		SimpleApplicationEventMulticaster applicationEventMulticaster = new SimpleApplicationEventMulticaster();
		applicationEventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
		return applicationEventMulticaster;
	}
}

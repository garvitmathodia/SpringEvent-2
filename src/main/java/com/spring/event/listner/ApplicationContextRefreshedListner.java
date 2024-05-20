package com.spring.event.listner;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListner 	{

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Application Initialised or Refreshed");
	}
	
	@EventListener
	public void handleContextStartedEvent(ContextStartedEvent event) {
		System.out.println("Application Initialised with start()");
	}
	
	@EventListener
	public void handleContextClosedEvent(ContextClosedEvent event) {
		System.out.println("Application Closed with closed()");
	}
	
	@EventListener
	public void handleContextStopEvent(ContextStoppedEvent event) {
		System.out.println("Application closed with stop()");
	}

}

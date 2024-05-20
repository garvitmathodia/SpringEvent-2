package com.spring.event.listner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.event.TransectionFailureEvent;

@Component
public class SendSmsListner {

	@EventListener	
	public void start(TransectionFailureEvent event) {
		System.out.println("Sending Email");
		System.out.println("Sending an email with body " + 
		"Hi " + event.getUsername() + "Transection Failed for amount " + event.getAmount());
	}
}

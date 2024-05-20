package com.spring.event.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.spring.event.TransectionFailureEvent;

@Component
public class Gpay {
	
	@Autowired
	private ApplicationEventPublisher publisher;

	public void sendMoney(String name , double amount , boolean condition) {
		try {
			if(condition) {			
				throw new RuntimeException("Transection failed");
			}
			System.out.println("Hi " + name);
			System.out.println("sending amount " + amount + " is successful");
		} catch (Exception e) {
			publisher.publishEvent(new TransectionFailureEvent(name , amount));
			e.printStackTrace();
		}
	}
}

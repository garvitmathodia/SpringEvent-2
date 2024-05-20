package com.spring.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.event.config.AppConfig;
import com.spring.event.publisher.Gpay;

@SpringBootApplication
public class SpringEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Gpay gpay = applicationContext.getBean("gpay" , Gpay.class);
		gpay.sendMoney("Garvit", 1000 , true);
	}

}

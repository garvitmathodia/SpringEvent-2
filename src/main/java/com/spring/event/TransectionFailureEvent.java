package com.spring.event;

public class TransectionFailureEvent {

	private String username;
	private double amount;

	public TransectionFailureEvent(String name, double amount) {
		this.username = name;
		this.amount = amount;
	}

	public String getUsername() {
		return username;
	}

	public double getAmount() {
		return amount;
	}

}

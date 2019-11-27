package com.java.interfacedemo;

public class PhoneMessage implements Message{

	private String message;
	
	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		System.out.println("Sending Phone Message with body : "+message);
	}

	@Override
	public String receiveMessage() {
		// TODO Auto-generated method stub
		return "Receiving Phone Message with body : "+message;
	}

}

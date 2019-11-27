package com.java.abstractclass;

public class PhoneMessage extends Message{

	private String message;
	
	@Override
	void sendMessage(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		System.out.println("Sending Phone Message with body : "+message);
	}

	@Override
	String receiveMessage() {
		// TODO Auto-generated method stub
		return "Receiving Phone Message with body : "+message;
	}

}

package com.java.abstractclass;

public class HangoutMessage extends Message{

	private String message;
	
	@Override
	void sendMessage(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		System.out.println("Sending Hangout Message with body : "+message);
	}
	

	@Override
	String receiveMessage() {
		// TODO Auto-generated method stub
		return "Receiving Hangout Message with body : "+message;
	}

}

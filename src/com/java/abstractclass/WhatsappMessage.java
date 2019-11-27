package com.java.abstractclass;

public class WhatsappMessage extends Message{

	private String message;
	
	@Override
	void sendMessage(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		System.out.println("Sending Whatapps Message with body : "+message);
	}

	@Override
	String receiveMessage() {
		// TODO Auto-generated method stub
		return "Receiving Whatapps Message with body : "+message;
	}

}

package com.java.interfacedemo;

public class SlackMessage implements Message{

	private String message;
	
	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		System.out.println("Sending Slack Message with body : "+message);
	}

	@Override
	public String receiveMessage() {
		// TODO Auto-generated method stub
		return "Receiving Slack Message with body : "+message;
	}

}

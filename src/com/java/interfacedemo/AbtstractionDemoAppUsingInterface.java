package com.java.interfacedemo;

public class AbtstractionDemoAppUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Phone Message		
		/*PhoneMessage phoneMessage  = new PhoneMessage();
		//Send Message
		sendMessage(phoneMessage, "Hello Ram");
		//Receive Message
		String messageString = receiveMessage(phoneMessage);
		System.out.println("Message : "+messageString);
		
		//For Slack Message
		SlackMessage slackMessage = new SlackMessage();
		slackMessage.sendMessage("Hello Shyam");
		messageString = slackMessage.receiveMessage();
		System.out.println("Slack Message : "+messageString);*/
		
		//Using Abstraction : Coding to interface or abstract class
		//Message message = new PhoneMessage();
		Message message = new PhoneMessage();
		sendMessage(message, "Hello Ghanshyam");
		String messageString = receiveMessage(message);
		System.out.println("Message : "+messageString);
		
	}
	
	public static void sendMessage(Message message, String messageString){
		message.sendMessage(messageString);
	}
	
	public static String receiveMessage(Message message){
		String messageString = message.receiveMessage();
		return messageString;
	}
	
	//Tasks
	//Add Implementation for WhatsAppMessage and HangoutMessage using both abstract class and intreface
	
}

package com.java.abstractclass;

public class AbtstractionDemoAppUsingAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Phone Message		
		PhoneMessage phoneMessage  = new PhoneMessage();
		//Send Message
		sendMessage(phoneMessage, "Hello Ram");
		//Receive Message
		String messageString = receiveMessage(phoneMessage);
		System.out.println("Message : "+messageString);
		
		//For Slack Message
		SlackMessage slackMessage = new SlackMessage();
		slackMessage.sendMessage("Hello Shyam");
		messageString = slackMessage.receiveMessage();
		System.out.println("Slack Message : "+messageString);
		
		//Using Abstraction : Coding to interface or abstract class
		
		//Hangout Message
		HangoutMessage message1= new HangoutMessage();
		sendMessage(message1, "Hello Ghanshyam");
		//Receive Message
		String messageString1 = receiveMessage(message1);
		System.out.println("Message : "+messageString1);
		
		//Whatsapp Message
		
		WhatsappMessage message12 = new WhatsappMessage();
		sendMessage(message12, "Hello Sagar");
		//Receive Message
		
		String string21 = receiveMessage(message12);
		System.out.println("Message :"+ string21);
		
	
	}
	
	public static void sendMessage(Message message, String messageString){
		message.sendMessage(messageString);
	}
	
	public static String receiveMessage(Message message){
		String messageString = message.receiveMessage();
		return messageString;
	}
	
}

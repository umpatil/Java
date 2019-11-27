package com.java.DateTimeDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate date = LocalDate.now();
		System.out.println("LocalDate is :"+date);
		
		LocalTime localTime =LocalTime.now();
		System.out.println("LocalTime is :"+localTime);
		
		
		//Format
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}

}

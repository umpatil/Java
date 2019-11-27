package com.java.inheritance;

public class Car extends MyVehical{

	

	private String carName = "Honda";
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//Car myVehical myVehical = new MyVehical();
		
		Car myVehical = new Car();
		myVehical.dis();
		System.out.println("My Car brand name is : "+myVehical.brand);
		System.out.println("Print card model name "+ myVehical.carName);
	}

}

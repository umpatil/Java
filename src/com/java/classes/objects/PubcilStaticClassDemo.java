package com.java.classes.objects;

public class PubcilStaticClassDemo {

	
	public void dis()
	{
		System.out.println("This is the Public Method");
	}
	static void dis1(int x)
	{
		System.out.println("This is the Static Method"+x);
	}

	
	
	public static void main(String[] args) {
		
		
		dis1(3);  //static method can be call without creating the OBJ.
		PubcilStaticClassDemo classDemo = new PubcilStaticClassDemo();
		
		classDemo.dis();
		
		
	}

}

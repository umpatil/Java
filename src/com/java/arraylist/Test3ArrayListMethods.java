package com.java.arraylist;

import java.util.ArrayList;

//ArrayList Methods Program

public class Test3ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Umesh");
		a1.add("Ganesh");
		a1.add("Suresh");
		a1.add("Ramesh");
		System.out.println(a1);
		
		a1.remove(3);  					//Array Method  1
		System.err.println("After deleting 3rd value :"+ a1);
		
		a1.set(1, "Sagar");				//Array Method 2
		System.err.println("After Adding one more value :"+ a1);
		
		System.out.println(a1.isEmpty());  //Array Method 3
		
		System.out.println("Size of ArrayList is :"+a1.size());  //Array Method 4
		
		

		
		

	}

}

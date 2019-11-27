package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList car = new ArrayList<>();
		
		car.add("Baleno");
		car.add('u');
		car.add(10);
		car.add(null);
		car.add(12.3);
		car.add(10);
	//	Collections.sort(car);
		
		
		System.out.println("ArrayList is :\n"+car);
		System.out.println(car.toString());
		System.out.println(car.get(2));
		
		car.set(2, "Mahindra");
		System.out.println(car);
		
		System.out.println(car.get(2));
		System.out.println(car.size());
		
		/*for(String i :car.keySet)
		for(int i=0;i<car.size();i++)
		{
			System.out.println(car.get(i));
		}
*/
		
	}

}

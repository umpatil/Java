package com.java.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Test5ArrayToCollectionConver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array to Collection conversion
		
		String [] s1 = {"Ram","Shyam","Umesh"};
		
		
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s1));
		a1.add("Ramesh");
		a1.add("Sudhakar");
		
		System.out.println(a1);
		
		
		//Collections to array conversion
		

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Ramesh");
		a2.add("Sudhakar");
		
		
		String[] s2 =new String[a2.size()];
		a2.toArray(s2);
		for (String ss:s2)
		{
		System.out.println(ss);
		}
		
		
		// Collection generic to array
		ArrayList a3 = new ArrayList();
		
		a3.add(22);
		a3.add("Ram");
		
		Object[] object = a3.toArray();
		for(Object ssa:object)
		{
			System.out.println(ssa);
		}
	}

}

package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Test6SwapAndSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String > a1 = new ArrayList<String>();
		
		a1.add("Ram");
		a1.add("Umeshj");
		a1.add("Radhjdsm");
		a1.add("shya");
		System.out.println("Lisyt is :"+a1);
		
		Collections .swap(a1, 1, 3);
		
		System.out.println(a1);
	}

}

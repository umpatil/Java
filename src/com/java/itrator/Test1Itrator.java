package com.java.itrator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test1Itrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Arm");
		a1.add("sss");
		ListIterator<String> a2 = a1.listIterator();
		a2.add("Ram");
		while (a2.hasNext()) {
			String ss = a2.next();
			if (ss.equals("Ram"))
				;
			a2.remove();

		}
		System.out.println(a2);

	}

}

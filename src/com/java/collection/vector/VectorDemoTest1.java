package com.java.collection.vector;

import java.util.ArrayList;

public class VectorDemoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Vector<String> v1 = new Vector<String>(); //String type vector
		 * 
		 * v1.add("Sagar"); v1.add("Umesh"); v1.add("Ramesh"); v1.add("Suraj");
		 * System.out.println(v1);
		 * 
		 * Vector v2 = new Vector(); //Common Vector
		 * 
		 * v2.add(10); v2.add(null); v2.add("Sagar"); v2.add(12); v2.add(10);
		 * v2.add(12.6);
		 * 
		 * System.out.println(v2);
		 * 
		 * String [] a = {"ara","ssa"};
		 * 
		 * Vector<String> v3 = new Vector<String>(Arrays.asList(a));
		 * v3.add("seema");
		 * 
		 * System.out.println(v3);
		 * 
		 * 
		 * Vector v4 = new Vector();
		 * 
		 * v4.add(10); v4.add("Ram"); v4.add(null); v4.add('c'); v4.add(12.2);
		 * 
		 * System.out.println(v4);
		 */
		/*
		 * Vector<Integer> v5 = new Vector<>();
		 * 
		 * for(int i=1;i<=30;i++) { v5.add(i); } System.out.println(v5);
		 * for(Vector<Integer> j=v5;j<v5.size();j++) {
		 * 
		 * }
		 */
		ArrayList<String> list1 = new ArrayList<String>(10);

		list1.add("Andy");
		list1.add("Bart");
		list1.add("Carl");
		list1.add(0, "Eve");
		list1.add(2, "hh");
		list1.add(4, "Oscar");

		// list1.set( "Zoltan", "Carl" );
		// list1.set( list1.indexOf("Carl"), "Zoltan" );
		System.out.println(list1);
		// System.out.println(list1.indexOf(2));

		/*
		 * ArrayList<String> list = new ArrayList<String>(10) ;
		 * System.out.println("Before"+list.size()); list.add( "Ann" );
		 * list.add( "Bob" ); list.add( "Eve" );
		 * System.out.println("After Running "+list.size());
		 */

	}

}

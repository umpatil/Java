package com.java.collection.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2RemoveDataIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int i=1;i<=30;i++)
		{
			a1.add(i);
		}
		System.out.println(a1);
		//Removing data through the iterator class

		Iterator<Integer> i1 = a1.iterator();
		while(i1.hasNext())
		{
			Integer i= i1.next();
			if(i%2==0)
				System.out.println("This is only Even Elements of Vector"+i);
			else
				i1.remove();
		}
		System.out.println(a1);
	}

}

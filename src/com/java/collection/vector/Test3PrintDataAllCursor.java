package com.java.collection.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test3PrintDataAllCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Product> v1 = new Vector<Product>();
		v1.add(new Product(22, "Pen", 10));
		v1.add(new Product(33, "book", 20));
		
		
		//Printing the data using enumeration
		
		Enumeration<Product> e =v1.elements();
		while(e.hasMoreElements())
		{
			Product p=e.nextElement();
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
		
		//Print Data using Iterator 
		
		Iterator<Product> i = v1.iterator();
		while(i.hasNext())
		{
			Product p1 = i.next();
			System.out.println(p1.id+" "+p1.name+" "+p1.cost);
			/*if(p1.id==22)
				i.remove();
			System.out.println(p1.id+p1.name+p1.cost);
			*/
		}
		
		//Print Data using ListIterator
		
		ListIterator<Product> lst = v1.listIterator();
		while(lst.hasNext())
		{
			Product p = lst.next();
			System.out.println(p.id+" "+p.name+p.cost);
		}
		
	}

}

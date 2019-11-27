package com.java.arraylist;

import java.util.ArrayList;

public class Test4ArrayConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList a1 = new ArrayList();
		
		a1.add(12);
		a1.add(22);
		
		System.err.println(a1);    //12,22
		ArrayList a2 = new ArrayList(a1);
		
		a2.add(33);
		
		System.out.println(a2);   ///12,22,33
	
		ArrayList a3 = new ArrayList();
		
		a3.add(34);
		
		a3.add(55);
		a3.addAll(a2);
		a3.addAll(a1);
		
		System.err.println(a3);  //34,55,12,22,33,12,22
		
		a3.removeAll(a2);
		System.out.println(a3);
		
		a3.containsAll(a1);
		
		System.out.println(a1);*/
		Employee employee = new Employee(2222, "Sagar");
		Employee employee1 = new Employee(2222, "Umesh");
		ArrayList<Employee> a4 = new ArrayList<Employee>();
		a4.add(employee);
		a4.add(employee1);
		
	//	a4.add(Employee);
		
		for (Employee employee21:a4)
		{
			System.out.println("Employee details :"+employee21.eId+employee21.eName);
		}
		
		ArrayList<Employee> a5 = new ArrayList<Employee>();
		
		a5.addAll(a4);
		
		//System.out.println(a5);
		for (Employee employee231:a5)
		{
			System.out.println("Employee details :"+employee231.eId+employee231.eName);
		}
		
	}

}

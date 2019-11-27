package com.java.arraylist; 

import java.util.ArrayList;

public class Test2StudAndEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> a2 = new ArrayList<Employee>();
		
		a2.add(new Employee(22, "Umesh"));
		a2.add(new Employee(12, "Sagar"));
		
		for(Employee employee:a2)
		{
			System.err.println(employee.eId+ " "+employee.eName);
			
		}
		Employee employee = a2.get(1);
		System.err.println(employee.eId + " "+ employee.eName);
	}

}

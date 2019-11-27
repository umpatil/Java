package com.java.arraylist;

import java.util.ArrayList;

public class TestStudAndEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al = new ArrayList();
		
		al.add(new Employee(1,"Umesh"));
		al.add(new Student(2,"Sagar"));
		al.add(10);
		al.add('R');
		al.add("Shree");
		al.add(null);
		
		System.out.println(al.toString());
		
		for(Object object :al)
		{
			if(object instanceof Employee)
			{
				Employee employee = (Employee) object;
				System.out.println(employee.eId+" "+employee.eName);
			}
			if(object instanceof Student)
			{
				Student student = (Student) object;
				System.out.println(student.sId+" "+student.sName);
				
			}
			if(object instanceof String)
			{
				System.out.println(object);
			}
			if(object instanceof Integer)
			{
				System.out.println(object);
			}
			if(object == null)
			{
				System.out.println(object);
			}
		}
		
	}

}

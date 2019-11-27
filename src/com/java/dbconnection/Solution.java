package com.java.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//register
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Create DriverManager
		
		try {
			Connection connection  = DriverManager.getConnection("jdbc:oracle:thin:@10.97.106.62:1521:orcl", "Test1", "test1");
		
			Statement statement = connection.createStatement();
				
			
			
			int isUpdated = statement.executeUpdate("update EMPLOYEE set salary =2999 where id=2");
			System.out.println("isUpdated :"+isUpdated);
			
			int isUpdated1 = statement.executeUpdate("Update employee SET age = 31 where name = 'Suresh'");
			System.out.println("isupdated : "+isUpdated1);
			
			
			//Extract Values From Result Set
		//	ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
			ResultSet resultSet = statement.executeQuery("Select * from EMPLOYEE");
			System.out.println("Size : "+resultSet);
			
			//Extract Values From Result Set
			while(resultSet.next()){
				System.out.println("In while loop");
				int id = resultSet.getInt(1);
				System.out.println("id : "+id);
				String name = resultSet.getString(2);
				System.out.println("Name : "+name);
				int salary = resultSet.getInt(3);
				System.out.println("Salary : "+salary);
				int age = resultSet.getInt(4);
				System.out.println("Age : "+age);
				System.out.println(id+" "+name+" "+salary+" "+age);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

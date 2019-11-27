package com.java.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//Register load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Create Drivermanager to get the connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.97.106.62:1521:orcl", "Test1", "test1");
			
			//Write Query
			Statement statement = connection.createStatement();
			
			//Execute Query
			int isUpdated = statement.executeUpdate("Update employee SET age = 31 where name = 'Suresh'");
			System.out.println("isupdated : "+isUpdated);
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
			
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
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Select any particular column for example name
		//update query for example : update salary
		//Select Query for aggregate funnction : max(salary), min (salary), avg(salary), sum(age)
		//Select any particular row using where cluase example : record with name matching to "Ramesh" i.e. Search
		//Delete any particular row from table
	}

}

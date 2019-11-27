package com.java.ScannerDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no;
		String name;
		double salary;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Id No :");
		no = scanner.nextInt();

		System.out.println("Enter the Employee Name :");
		name = scanner.next();

		System.out.println("Enter the Employee Salary :");
		salary = scanner.nextDouble();

		System.out.println("No :\n" + no + " Name :\n" + name + "Salary : \n"
				+ salary);

		LocalDate date = LocalDate.now();
		System.out.println("Date :" + date);
		LocalTime localTime = LocalTime.now();
		System.out.println("Date :" + localTime);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(dateTimeFormatter);
	}

}

package com.app.payroll;

import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	int ssn;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter the First Name : ");
		this.firstName = sc.next();
		System.out.println("Enter the Last Name : ");
		this.lastName = sc.next();
		System.out.println("Enter the SSN number : ");
		this.ssn = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
	
}

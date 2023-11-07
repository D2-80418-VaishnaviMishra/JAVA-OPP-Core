package com.app.payroll;

import java.util.Scanner;

public class SalariedEmployee extends Employee{
	double weeklySalary;
	
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String firstName, String lastName, int ssn,double weeklySalary) {
		super(firstName,lastName,ssn);
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.print("Enter the Weekly Salary : ");
		this.weeklySalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}
	
	
}

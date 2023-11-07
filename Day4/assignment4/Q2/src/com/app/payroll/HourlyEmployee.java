package com.app.payroll;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	double hourlyWage;
	double hours;
	
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String firstName, String lastName, int ssn,double hourlyWage, double hours) {
		super(firstName,lastName,ssn);
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the Hourly Wage : ");
		this.hourlyWage = sc.nextDouble();
		System.out.println("Enter the hours : ");
		this.hours = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString()+"HourlyEmployee [hourlyWage=" + hourlyWage + ", hours=" + hours + "]";
	}
	
	public void salaryIs() {
		if (hours<=40) {
			System.out.println(hourlyWage*hours);
		} else {
			System.out.println(("Salary is "+hourlyWage*40)+(hours-40)*hourlyWage*hours*1.5);
		}
	}
	
	
}

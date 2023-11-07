package com.app.payroll;

import java.util.Scanner;

public class BasePlusCommisioned extends CommissionEmployee{
	double baseSalary;
	
	public BasePlusCommisioned() {
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommisioned(String firstName, String lastName, int ssn,int grossSales, double commisionRate,double baseSalary) {
		super(firstName,lastName,ssn,grossSales,commisionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the Base Salary : ");
		this.baseSalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString()+"BasePlusCommisioned [baseSalary=" + baseSalary + "]";
	}
	
	public void salaryIs() {
		System.out.println("Salary is "+((commisionRate*grossSales)+baseSalary));
	}
	
	public void raise() {
		this.baseSalary = this.baseSalary*1.1;
	}
	
}

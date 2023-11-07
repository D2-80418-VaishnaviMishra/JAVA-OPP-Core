package com.app.payroll;

import java.util.Scanner;

public class CommissionEmployee extends Employee{
	int grossSales;
	double commisionRate;
	
	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
	}

	public CommissionEmployee(String firstName, String lastName, int ssn,int grossSales, double commisionRate) {
		super(firstName,lastName,ssn);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Gross Sales : ");
		this.grossSales = sc.nextInt();
		System.out.println("Enter commissionRate : ");
		this.commisionRate = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString()+"CommissionEmployee [grossSales=" + grossSales + ", commisionRate=" + commisionRate + "]";
	}
	
	public void salaryIs() {
		System.out.println("Salary is "+(grossSales*commisionRate));
	}
	
	
}

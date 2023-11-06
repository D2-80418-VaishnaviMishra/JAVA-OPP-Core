package com.sunbeam;

import java.util.Scanner;

abstract public class Employee extends Person {
	private int id;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
//		if (id>10000 || id<0) {
//			throw new CustomException("Id",id);
//		}
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
//		if (salary>1000000 || salary<15000) {
//			throw new CustomException("Salary",salary);
//		}
		this.salary = salary;
	}
	
	abstract public double calcSalary();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the id of the employee : ");
		this.id = sc.nextInt();
		System.out.println("Enter the salary of the employee : ");
		this.salary = sc.nextDouble();
	}
	
	
}

package com.sunbeam;

import java.util.*;

public class Employee implements Comparable<Employee>{

	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (obj instanceof Employee) {
			Employee emp = (Employee)obj;
			if (this.getEmpid()==emp.getEmpid()) {
				return true;
			}
		}
		return false;
	}
	
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee id : ");
		this.empid = sc.nextInt();
		System.out.println("Enter the name of the empployee : ");
		this.name = sc.next();
		System.out.println("Enter the salary of the employee : ");
		this.salary = sc.nextDouble();
	}
	
	@Override
	public int compareTo(Employee arg0) {
		int diff = this.empid - arg0.empid;
		return diff;
	}
	
}


package com.sunbeam;

public class Clerk implements Emp{
	private double salary;

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return salary;
	}
	
	
	
}

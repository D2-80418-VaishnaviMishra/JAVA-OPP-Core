package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		
		Employee emp1 = new Labor(1500,12);
		Box<Employee> b = new Box<>(emp1);
		
		System.out.println(b.getSalary());
		
		
		Employee emp2 = new Clerk();
		Box<Employee> b1 = new Box<>(emp2);
		
		System.out.println(b1.getSalary());
		
		
	}

}

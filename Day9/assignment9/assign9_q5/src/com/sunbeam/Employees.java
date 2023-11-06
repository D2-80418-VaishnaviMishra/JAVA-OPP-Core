package com.sunbeam;

public class Employees {
	public double averageSalLabor(Employee[] arr) {
		int count = 0;
		double total = 0.0;
		for(Employee e : arr) {
			if (e!=null && (e instanceof Labor)) {
				total = total + e.calcSalary();
				count++;
			}
		}
		return total/count;
	}
	
	public double averageSalSalesmans(Employee[] arr) {
		int count = 0;
		double total = 0.0;
		for(Employee e : arr) {
			if (e!=null && (e instanceof Salesman)) {
				total = total + e.calcSalary();
				count++;
			}
			
		}
		return total/count;
	}
	
	public double averageSalClerks(Employee[] arr) {
		int count = 0;
		double total = 0.0;
		for(Employee e : arr) {
			if (e!=null && (e instanceof Clerk)) {
				total = total + e.calcSalary();
				count++;
			}
			
		}
		return total/count;
	}
}

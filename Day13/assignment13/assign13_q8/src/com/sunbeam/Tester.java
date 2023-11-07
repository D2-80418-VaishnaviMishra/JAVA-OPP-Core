package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		Emp[] earr = new Emp[3];
		earr[0] = new Manager(50000,20000);
		earr[1] = new Clerk(12000);
		earr[2] = new Labor(250,100);
		
		double manSal = earr[0].getSal();
		System.out.println("Managers salary : "+manSal);
		System.out.println("Clerks salary : "+earr[1].getSal());
		System.out.println("Labor salary : "+earr[2].getSal());
		
		double total = Emp.calcTotalIncome(earr);
		System.out.println("Total income of all employees : "+total);

	}

}

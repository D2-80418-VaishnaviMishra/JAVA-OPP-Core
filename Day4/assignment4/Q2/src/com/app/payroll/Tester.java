package com.app.payroll;

import java.util.Scanner;

public class Tester {
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("=====================================================");
		System.out.println("0. Exit");
		System.out.println("1. Add Salaried Employee");
		System.out.println("2. Add Hourly Salaried Employee");
		System.out.println("3. Commissioned Employee");
		System.out.println("4. Base Salary + Commissioned Employee");
		System.out.println("5. Show all the Employee Details");
		System.out.println("6. Show Salaried Employee Details");
		System.out.println("7. Show Hourly Salaried Employee Details");
		System.out.println("8. Show Commissioned Salaried Employee Details");
		System.out.println("9. Show Base Salary + Commissioned Employee Details");
		System.out.println("10. Raise the Base salary by 10% of Base Salary + Commissioned Employee");
		System.out.println("Enter your choice : ");
		choice  = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Employees");
		int size = sc.nextInt();
		Employee[] emp = new Employee[size];
		int choice;
		int counter = 0;
		while ((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				if (counter>=size) {
					System.out.println("Employee array is full..............");
				} else {
					emp[counter] = new SalariedEmployee();
					emp[counter].acceptData(sc);
					counter++;
				}
				break;
			case 2:
				if (counter>=size) {
					System.out.println("Employee array is full..............");
				} else {
					emp[counter] = new HourlyEmployee();
					emp[counter].acceptData(sc);
					counter++;
				}
				break;
			case 3:
				if (counter>=size) {
					System.out.println("Employee array is full..............");
				} else {
					emp[counter] = new CommissionEmployee();
					emp[counter].acceptData(sc);
					counter++;
				}
				break;
			case 4:
				if (counter>=size) {
					System.out.println("Employee array is full..............");
				} else {
					emp[counter] = new BasePlusCommisioned();
					emp[counter].acceptData(sc);
					counter++;
				}
				break;
			case 5:
				for(int i=0;i<size;i++) {
					if (emp[i]!=null) {
						System.out.println(emp[i]);
					}
				}
				break;
			case 6:
				for(int i=0;i<size;i++) {
					if (emp[i]!=null && (emp[i] instanceof SalariedEmployee)) {
						System.out.println(emp[i]);
					}
				}
				break;
			case 7:
				for(int i=0;i<size;i++) {
					if (emp[i]!=null && (emp[i] instanceof HourlyEmployee)) {
						System.out.println(emp[i]);
					}
				}
				break;
			case 8:
				for(int i=0;i<size;i++) {
					if (emp[i]!=null && (emp[i] instanceof CommissionEmployee)) {
						System.out.println(emp[i]);
					}
				}
				break;
			case 9:
				for(int i=0;i<size;i++) {
					if (emp[i]!=null && (emp[i] instanceof BasePlusCommisioned)) {
						System.out.println(emp[i]);
					}
				}
				break;
			case 10:
				for(int i=0;i<size;i++) {
					if (emp[i]!=null && (emp[i] instanceof BasePlusCommisioned)) {
						BasePlusCommisioned bpc = (BasePlusCommisioned)emp[i];
						bpc.raise();
					}
				}
				break;
			default:
				System.out.println("Enter the correct choice...............");
				break;
			}
		}
	}
}
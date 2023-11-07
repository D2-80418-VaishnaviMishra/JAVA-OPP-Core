package com.sunbeam;

import java.util.*;

public class Tester {
	
	public static int menu(Scanner sc) {
		System.out.println("==================================");
		System.out.println("0. Exit");
		System.out.println("1. Add student");
		System.out.println("2. Search student");
		System.out.println("==================================");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Student> map = new HashMap<>();
		int choice = 0;
		while((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				Student s = new Student();
				s.accept();
				//use contains method to check whether the key already exit in the map or not
				map.put(s.getRoll(), s);
				System.out.println("Student Successfully Added.........");
				break;
			case 2:
				System.out.print("Enter the roll no of student : ");
				int roll = sc.nextInt();
				Student temp = map.get(roll);
				System.out.println(temp);
			default:
				System.out.println("Enter the correct choice.......");
				break;
			}
			
		}
		System.out.println("Bye..........");
//		Student s = new Student();
//		s.accept();
//		map.put(s.getRoll(), s);
//		
//		int roll = sc.nextInt();

	}

}

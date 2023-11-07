package clcTest;

import java.util.Scanner;

import clc.Clc;

public class ClcTest {
//	public static int menu() {
//		int choice;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("=============================================");
//		System.out.println("0. Exit");
//		System.out.println("1. Input the customer details");
//		System.out.println("2. Calculate the Credit");
//		System.out.println("=============================================");
//		System.out.print("Enter your choice : ");
//		choice = sc.nextInt();
//		return choice;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of customers : ");
		int temp = sc.nextInt();
		Clc []c = new Clc[temp];
		for (int i=0;i<temp;i++) {
			c[i] = new Clc();
			c[i].acceptCustomer();
			c[i].calculate();
		}
//		for (int i=0;i<c.length;i++) {
//			c[i].calculate();
//		}
//		int choice;
//		while ((choice = menu())!=0) {
//			switch (choice) {
//			case 1:
//				
//				for (int i=0;i<temp;i++) {
//					c[i] = new Clc();
//					c[i].acceptCustomer();
//				}
//				break;
//			case 2:
//				for (int i=0;i<c.length;i++) {
//					c[i].calculate();
//				}
//				break;
//
//			default:
//				System.out.println("Enter the correct choice");
//				break;
//			}
//		}
	}

}

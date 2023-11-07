package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("1. Display details of a specific point");
		System.out.println("2. Display x,y co-ordinates of all points");
		System.out.println("3. Display between the two points (Enter the indexes)");
		System.out.println("4. Exit");
		System.out.println("=============================================");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points to plot : ");
		int size = sc.nextInt();
		
		Point2D[] parr = new Point2D[size];
		
		for(int i=0;i<size;i++) {
			parr[i] = new Point2D();
			parr[i].accept();
		}
		
		int choice;
		while ((choice = menu())!=4) {
			switch (choice) {
			case 1:
				int index;
				System.out.println("Enter the index of the point x,y");
				index = sc.nextInt();
				if (index>=size || index<0) {
					System.out.println("Invalid Index, pls retry!!!");
				} else {
					System.out.println(parr[index].getDetails());
				}
				break;
			case 2:
				for (int i=0;i<size;i++) {
					System.out.println(parr[i].getDetails());
				}
				break;
			case 3:
				int ind1,ind2;
				System.out.println("Enter the index 1 of the point x,y");
				ind1 = sc.nextInt();
				System.out.println("Enter the index 2 of the point x,y");
				ind2 = sc.nextInt();
				if ((ind1>=size || ind1<0) || (ind2>=size || ind2<0)) {
					System.out.println("Invalid Index, pls retry!!!");
				} else {
					 if (parr[ind1].isEqual(parr[ind2])) {
				            System.out.println("p1 and p2 are located at the same position.");
				        } else {
				            double distance = parr[ind1].calculateDistance(parr[ind2]);
				            System.out.println("p1 and p2 are located at different positions.");
				            System.out.println("Distance between p1 and p2 is: " + distance);
				        }
				}
			default:
				System.out.println("Enter the correct choice");
				break;
			}
		}

	}

}

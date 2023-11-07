package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("==========================================================");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.print("Enter Your choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the basket size : ");
		size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int choice;
		int counter = 0;
		
		String name;
		String color;
		double weight;
		
		while ((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				if (counter>=size) {
					System.out.println("Basket is Full");
				} else {
				System.out.print("Enter the name of the fruit : ");
				name = sc.next();
				System.out.print("Enter the color of the fruit : ");
				color = sc.next();
				System.out.print("Enter the weight of the fruit : ");
				weight = sc.nextDouble();
				basket[counter] = new Mango(color,weight,name,true);
				counter++;
				}
				break;
			case 2:
				if (counter>=size) {
					System.out.println("Basket is Full");
				} else {
				System.out.print("Enter the name of the fruit : ");
				name = sc.next();
				System.out.print("Enter the color of the fruit : ");
				color = sc.next();
				System.out.print("Enter the weight of the fruit : ");
				weight = sc.nextDouble();
				basket[counter] = new Orange(color,weight,name,true);
				counter++;
				}
				break;
			case 3:
				if (counter>=size) {
					System.out.println("Basket is Full");
				} else {
				System.out.print("Enter the name of the fruit : ");
				name = sc.next();
				System.out.print("Enter the color of the fruit : ");
				color = sc.next();
				System.out.print("Enter the weight of the fruit : ");
				weight = sc.nextDouble();
				basket[counter] = new Apple(color,weight,name,true);
				counter++;
				}
				break;
			case 4:
				for (int i=0;i<size;i++) {
					if (basket[i]!=null) {
						System.out.println("Name = "+basket[i].getName());
					}
				}
				
				break;
			case 5:
				for (int i=0;i<size;i++) {
					if (basket[i]!=null && basket[i].isFresh()) {
						System.out.println(basket[i]+basket[i].taste());
					}
				}
				break;
			case 6:
				for (int i=0;i<size;i++) {
					if (basket[i]!=null && !basket[i].isFresh()) {
						System.out.println(basket[i].taste());
					}
				}
				break;
			case 7:
				System.out.print("Enter the index : ");
				int staleInd = sc.nextInt();
				basket[staleInd].setFresh(false);
				break;
			case 8:
				System.out.print("Still building........");
				break;
			default:
				break;
			}
		}

	}

}

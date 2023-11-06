package com.sunbeam;

import java.util.Scanner;

public class Program {
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("============================================");
		System.out.println("1. Add Book");
		System.out.println("2. Add Album");
		System.out.println("3. Add Toy");
		System.out.println("============================================");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static double getTotalBill(Product[] parr) {
		double totalBill=0;
		for(Product ele:parr) {
			totalBill+=ele.getPrice();
		}
		return totalBill;
	}
	
	public static double getTaxedBill(Product[] parr,int discount ) {
		double taxedBill = 0;
		for(Product ele:parr) {
			if (ele instanceof Book) {
//				double price = ele.getPrice();
				taxedBill+=ele.getDiscountedPrice();
			}
			else if (ele instanceof Album) {
				double taxPercent = ((double)((Album)ele).getTax()) / 100.0;
				double taxedAmt = taxPercent * ele.getDiscountedPrice();
				taxedBill+=ele.getDiscountedPrice()+taxedAmt;
			}
			else if (ele instanceof Toy) {
				double taxPercent = ((double)((Toy)ele).getTax()) / 100.0;
				double taxedAmt = taxPercent* ele.getDiscountedPrice();
				taxedBill+=ele.getDiscountedPrice()+taxedAmt;
			}
			
		}
		return taxedBill;
	}
	
	public static int inputSize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products you want to buy(max 5) : ");
		int size = sc.nextInt();
		if (size>5 || size<0) {
			System.err.println("Enter the value between 0 to 5");
			inputSize();
		}
		return size;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = inputSize();
		
		Product[] parr = new Product[size];
		
		int booksCount=0,albumsCount=0,toysCount = 0;
		int count = 0;
		while (count<size) {
			int choice = menu(sc);
			switch (choice) {
			case 1:
				parr[count] = new Book();
				parr[count].acceptData(sc);
				booksCount++;
				count++;
				break;
			case 2:
				parr[count] = new Album();
				parr[count].acceptData(sc);
				albumsCount++;
				count++;
				break;
			case 3:
				parr[count] = new Toy();
				parr[count].acceptData(sc);
				toysCount++;
				count++;
				break;
			default:
				System.out.println("Enter the valid choice...........");
				break;
			}
		}
		
		double totalBill = getTotalBill(parr);
		System.out.println("Total Bill : "+totalBill);
		
		Product p = new Product();
		int discount = p.getDiscount();
		
		double discountedBill = totalBill - ((totalBill*discount)/100);
		System.out.println("Discounted Bill : "+discountedBill);
		
		double billAfterTax = getTaxedBill(parr,discount);
		System.out.println("Bill After Tax : "+billAfterTax);
		
		
		
		

	}

}

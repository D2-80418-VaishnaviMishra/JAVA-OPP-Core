package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Tester {
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("===================================================");
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Delete book of given id");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("===================================================");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Collection<Book> barr = new ArrayList<>();
		
		int choice;
		while ((choice = menu(sc))!=0) {
				switch (choice) {
				case 1:
					System.out.print("Enter ISBN number of the book : ");
					String isbn = sc.next();
					System.out.print("Enter the price : ");
					double price = sc.nextDouble();
					System.out.println("Enter the author name : ");
					String name = sc.next();
					System.out.println("Enter the quantity : ");
					int quan = sc.nextInt();
					Book b = new Book(isbn,price,name,quan);
					barr.add(b);
					System.out.println("Book Successfully Added");
					break;
				case 2:
					if (barr.size()==0) {
						System.out.println("List is empty.");
					} else {
						for(Book b1:barr) {
							System.out.println(b1);
						}
					}
					break;
				case 3:
					System.out.print("Enter the ISBN of the book to delete : ");
					String isbn1 = sc.next();
					Book b2 = new Book();
					b2.setIsbn(isbn1);
					barr.remove(b2);
					System.out.println("Book deleted successfully from the list.");
					break;
				case 4:
					System.out.println("Enter the ISBN of the book : ");
					String isbn2 = sc.next();
					Book b3 = new Book();
					b3.setIsbn(isbn2);
					if (barr.contains(b3)) {
						System.out.println("Book found.");
					} else {
						System.out.println("Book not found");
					}
					break;
				case 5:
					barr.clear();
					System.out.println("All books in the list are deleted Successfully.");
					break;
				case 6:
					System.out.println("Total no of books in the list = "+barr.size()); 
					break;
				default:
					System.out.println("Enter the correct choice........");
					break;
				}
		}
		System.out.println("Bye....");
//		do {
//			
//		} while ((choice = menu(sc))!=0);
	}

}

package com.sunbeam;

import java.util.*;

public class Tester {
	
	public static int equals1(){
		return 0;
	}
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("===================================================");
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Delete a book with given name");
		System.out.println("7. Sort books by isbn in asc order");
		System.out.println("8. Sort books by price in desc order");
		System.out.println("9. Reverse the list");
		System.out.println("===================================================");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> barr = new ArrayList<>();
		
		int choice;
		while ((choice = menu(sc))!=0) {
				switch (choice) {
				case 1:
					Book b = new Book();
					b.accept();
					
					int index = barr.indexOf(b);
					if (barr.size()==0 || index==-1) {
						barr.add(b);
						System.out.println("Book Successfully Added");
					} else {
						Book temp1 = barr.get(index);
						temp1.setQuantity(temp1.getQuantity()+b.getQuantity());
						System.out.println("Book Already exist changes its quantity");
					}
					
					break;
				case 2:
					if (barr.size()==0) {
						System.err.println("List is empty.");
					} else {
						System.out.println("Traverse list using random access: ");
						for(int i=0; i<barr.size(); i++) {
							Book ele = barr.get(i);
							System.out.println(ele);
						}
					}
					break;
				case 3:
					System.out.print("Enter the ISBN of the book : ");
					String isbn1 = sc.next();
					Book case3 = new Book();
					case3.setIsbn(isbn1);
					int index1 = barr.indexOf(case3);
					if (index1>barr.size() || index1<0) {
						System.err.println("Book not found...........");
					} else {
						Book case31 = barr.get(index1);
						System.out.println(case31);
					}
					break;
				case 4:
//					System.out.println("Enter the ISBN of the book : ");
//					String isbn2 = sc.next();
//					Book b3 = new Book();
//					b3.setIsbn(isbn2);
//					if (barr.contains(b3)) {
//						System.out.println("Book found.");
//					} else {
//						System.out.println("Book not found");
//					}
//					System.out.print("Enter the ISBN of the book to delete : ");
//					String isbn4 = sc.next();
//					Book b2 = new Book();
//					b2.setIsbn(isbn4);
//					barr.remove(b2);
//					System.out.println("Book deleted successfully from the list.");
					System.out.print("Enter the index of the book to delete : ");
					int case4 = sc.nextInt();
					if (case4>barr.size()||case4<0) {
						System.err.println("Index out of range........");
					}
					barr.remove(case4);
					System.out.println("Book deleted successfully");
					break;
				case 5:
					System.out.print("Enter the ISBN of the book to delete : ");
					String isbn5 = sc.next();
					Book b3 = new Book();
					b3.setIsbn(isbn5);
					barr.remove(b3);
					System.out.println("Book deleted successfully from the list.");
					break;
				case 6:
					System.out.print("Enter the name of the author : ");
					String authName = sc.next();
					Book case6 = new Book();
					case6.setAuthorName(authName);
					
					int ind1 = 0;
					
					for(int i=0;i<barr.size();i++) {
						Book ele = barr.get(i);
						int diff = ele.getAuthorName().compareTo(authName);
						if (diff==0) {
							ind1 = i;
						}
					}
					barr.remove(barr.get(ind1));
					System.out.println("Book deleted successfully");
					break;
				case 7:
					Collections.sort(barr); 
					System.out.println("Books list sorted by ISBN (Ascending) successfully...");
					break;
				case 8:
					class BooksDescComparator implements Comparator<Book>{
						@Override
						public int compare(Book arg0, Book arg1) {
							int diff = -Double.compare(arg0.getPrice(), arg1.getPrice());
							return diff;
						}
					}
					Collections.sort(barr,new BooksDescComparator());
					System.out.println("Books list sorted by ISBN (Descending) successfully...");
					break;
				case 9:
					Collections.reverse(barr);
					System.out.println("List reversed successfully");
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

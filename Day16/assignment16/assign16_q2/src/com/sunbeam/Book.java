package com.sunbeam;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>,Serializable{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN number of the book : ");
		this.isbn = sc.next();
		System.out.print("Enter the price : ");
		this.price = sc.nextDouble();
		System.out.println("Enter the author name : ");
		this.authorName = sc.next();
		System.out.println("Enter the quantity : ");
		this.quantity = sc.nextInt();
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Book) {
			Book other = (Book) obj;
			if (this.isbn.equals(other.getIsbn())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int compareTo(Book arg0) {
		int diff = this.getIsbn().compareTo(arg0.getIsbn());
		return diff;
	}
	
	
}

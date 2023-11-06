package com.sunbeam;

import java.util.Scanner;

public class Book extends Product{
	private String isbn;
	private String author;
	private String subject;
	
	public Book() {
	}
	
	public Book(String isbn, String author, String subject) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.subject = subject;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", subject=" + subject + "]";
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the isbn of book : ");
		this.isbn = sc.next();
		System.out.println("Enter the author of book : ");
		this.author = sc.next();
		System.out.println("Enter the subject of book : ");
		this.subject = sc.next();
	}

	@Override
	public double getDiscountedPrice() {
		return getPrice() - ((getPrice()*getDiscount())/100);
	}
	
}

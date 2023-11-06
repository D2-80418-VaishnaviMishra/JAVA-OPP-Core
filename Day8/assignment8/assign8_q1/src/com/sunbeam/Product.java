package com.sunbeam;

import java.util.Scanner;

public class Product {
	private String title;
	private double price;
	private int discount = 10;
	
	public Product() {
	}
	
	public Product(String title, double price, int discount) {
		super();
		this.title = title;
		this.price = price;
		this.discount = discount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + ", discount=" + discount + "]";
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter the title of the product : ");
		this.title = sc.next();
		System.out.println("Enter the price of the product : ");
		this.price = sc.nextDouble();
		
	}
	
	public double getDiscountedPrice() {
		return getPrice() - ((getPrice()*getDiscount())/100);
	};
	
}

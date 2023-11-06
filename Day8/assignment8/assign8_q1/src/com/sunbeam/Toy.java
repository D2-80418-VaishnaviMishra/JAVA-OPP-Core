package com.sunbeam;

import java.util.Scanner;

public class Toy extends Product{
	private String ageGroup;
	private int tax=5;
	
	public Toy() {
		super();
	}

	public Toy(String ageGroup, int tax) {
		super();
		this.ageGroup = ageGroup;
		this.tax = tax;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Toy [ageGroup=" + ageGroup + ", tax=" + tax + "]";
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the age group : ");
		this.ageGroup = sc.next();
		
	}

	@Override
	public double getDiscountedPrice() {
		// TODO Auto-generated method stub
		return getPrice() - ((getPrice()*getDiscount())/100);
	}
	
	
}

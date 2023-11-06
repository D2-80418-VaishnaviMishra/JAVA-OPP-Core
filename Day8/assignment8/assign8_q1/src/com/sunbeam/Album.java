package com.sunbeam;

import java.util.Scanner;

public class Album extends Product{
	private String singer;
	private String musician;
	private int tax = 10;
	
	public Album() {
	}
	
	public Album(String singer, String musician, int tax) {
		super();
		this.singer = singer;
		this.musician = musician;
		this.tax = tax;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMusician() {
		return musician;
	}

	public void setMusician(String musian) {
		this.musician = musian;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
	@Override
	public String toString() {
		return "Album [singer=" + singer + ", musician=" + musician + ", tax=" + tax + "]";
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the name of singer : ");
		this.singer = sc.next();
		System.out.println("Enter the name of musician : ");
		this.musician = sc.next();
		
	}

	@Override
	public double getDiscountedPrice() {
		// TODO Auto-generated method stub
		return getPrice() - ((getPrice()*getDiscount())/100);
	}
	
	
}

package com.sunbeam;

import java.util.Scanner;

public class Labor extends Employee{
	private double rate;
	private int hours;
	
	public Labor() {
		// TODO Auto-generated constructor stub
	}

	public Labor(double rate, int hours) {
		this.rate = rate;
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
//		if (rate>2000 || rate<300) {
//			throw new CustomException("Rate",rate);
//		}
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
//		if (hours>10 || hours<0) {
//			throw new CustomException("Rate",rate);
//		}
		this.hours = hours;
	}

	@Override
	public double calcSalary() {
		return this.hours*this.rate;
	}

	@Override
	public String toString() {
		return String.format("Labor [rate=%s, hours=%s]", rate, hours);
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the wage of the labor : ");
		this.rate = sc.nextDouble();
		System.out.println("Enter the no of working hours : ");
		this.hours =sc.nextInt();
		
	}
	
	
	
}

package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	private int target;
	private double commission;
	
	public Salesman() {
	}

	public Salesman(int target, double commission) {
		this.target = target;
		this.commission = commission;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommision(double commission) {
		this.commission = commission;
	}

	@Override
	public double calcSalary() {
		return super.getSalary()+(target*commission);
	}

	@Override
	public String toString() {
		return String.format("Salesman [target=%s, commission=%s]", target, commission);
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the target : ");
		this.target = sc.nextInt();
		System.out.println("Enter the commission : ");
		this.commission = sc.nextDouble();
	}
	
	
}

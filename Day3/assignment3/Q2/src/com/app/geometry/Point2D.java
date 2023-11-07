package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	double x;
	double y;
	
	public Point2D() {
		
	}
	
	public Point2D(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		return "(" + x + ", " + y + ")";
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinates for x y");
		this.x = sc.nextDouble();
		this.y = sc.nextDouble();
	}
	
	public boolean isEqual(Point2D other) {
		return this.x == other.x  && this.y == other.y;
	}
	
	public double calculateDistance(Point2D other) {
		double dx = this.x - other.y;
		double dy = this.y - other.y;
		double res = Math.pow(dx, 2) + Math.pow(dy,2);
		return Math.sqrt(res);
	}
}

package com.sunbeam.shapes;

public class Circle extends BoundedShape{
	private double radius;
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calArea() {
		return 3.14*this.radius*this.radius;
	}
	
	
	
}

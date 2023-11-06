package com.sunbeam.shapes;

public class Square extends Polygon{
	private double side;
	
	public Square() {
	}

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calArea() {
		return side*side;
	}
	
	
}

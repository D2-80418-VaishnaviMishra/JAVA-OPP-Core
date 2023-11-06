package com.sunbeam.shapes;

public abstract class Polygon extends BoundedShape {
	private int num_of_sides;
	
	public Polygon() {
	}

	public Polygon(int num_of_sides) {
		this.num_of_sides = num_of_sides;
	}
	
	
}

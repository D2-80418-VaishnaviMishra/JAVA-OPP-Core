package com.sunbeam.tester;

import com.sunbeam.shapes.*;

public class Tester {

	public static void main(String[] args) {
		BoundedShape circle = new Circle(5);
		System.out.println(circle.calArea());

		Polygon triangle = new Triangle(5,6,7);
		System.out.println(triangle.calArea());
		
		Polygon rectangle = new Rectangle(10,20);
		System.out.println(rectangle.calArea());
		
		Polygon square = new Square(10);
		System.out.println(square.calArea());
	}

}

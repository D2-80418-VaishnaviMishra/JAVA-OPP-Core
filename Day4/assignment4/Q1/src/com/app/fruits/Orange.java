package com.app.fruits;

public class Orange extends Fruit {
	
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
}

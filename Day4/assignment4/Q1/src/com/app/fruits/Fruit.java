package com.app.fruits;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit() {
		this("",0,"",false);
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String taste() {
		return "No specific tase";
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	
}

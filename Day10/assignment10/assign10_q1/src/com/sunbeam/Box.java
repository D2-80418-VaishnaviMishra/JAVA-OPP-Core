package com.sunbeam;

public class Box <T>{
	private T obj;
	
	public Box() {
	}
	
	public Box(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return this.obj;
	}
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public double getSalary() {
		return ((Employee) obj).calcSalary();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}

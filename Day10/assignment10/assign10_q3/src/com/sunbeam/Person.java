package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable {
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		this.name = sc.next();
		System.out.println("Enter age: ");
		this.age = sc.nextInt();
	}
	@Override
	public void display() {
		System.out.printf("Name: %s\nAge: %d\n", this.name, this.age);
			// %d - int/short/long, %f - float/double, %s - string/anything
	}
}

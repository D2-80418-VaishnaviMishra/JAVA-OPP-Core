package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	
	public Person() {
	}

	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void accept(Gender gender) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		this.name = sc.next();
		System.out.println("Enter the age : ");
		this.age = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

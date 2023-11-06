package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Person {
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
		if (!(name instanceof String) || name==null){
			throw new CustomException("Name",name);
		}
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if (age<15 || age>80) {
			throw new CustomException("Age",age);
		}
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter the name : ");
		this.name = sc.next();
		System.out.print("Enter the age : ");
		this.age = sc.nextInt();
	}
	
	
}

package com.sunbeam;

public class Person implements Cloneable{
	private String name;
	private Date birth;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, Date birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(birth.getDay()+"/"+birth.getMonth()+"/"+birth.getYear());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birth=" + birth + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person temp = (Person)super.clone();
		temp.birth = (Date)this.birth.clone();
		return temp;
	}
}

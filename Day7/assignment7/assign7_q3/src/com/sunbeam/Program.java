package com.sunbeam;

public class Program {

	public static void main(String[] args)  throws CloneNotSupportedException{
		Person p1 = new Person("bhanu",new Date(20,8,2001));
		p1.display();
		
		Person p2 = (Person)p1.clone();
		p2.display();
		p2.getBirth().setMonth(10);
		
		p1.display();
		p2.display();

	}

}

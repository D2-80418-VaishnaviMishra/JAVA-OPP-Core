package com.sunbeam;

import java.util.*;


public class Tester {

	public static void main(String[] args) {
		Set<Book> set = new LinkedHashSet<>();
		
		Collections.addAll(set, 
				new Book("1",500,"bhanu",2),
				new Book("1",1500,"bhanu",4),
				new Book("3",500,"shubham",5),
				new Book("2",1500,"vivek",3));
				
		
//		barr.add(new Book("1",500,"Bhanu",2));
//		barr.add(new Book("1",500,"Bhanu",4));
		
		for(Book e : set)
			System.out.println(e);

	}

}

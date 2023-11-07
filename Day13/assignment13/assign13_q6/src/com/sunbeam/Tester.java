package com.sunbeam;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		
		Map<String,Book> map = new HashMap<>();

		Book b = new Book();
		
		//accepted from user
		b.accept();
		
		//inserted in map
		map.put(b.getIsbn(), b);
		
		//Finding in the map
		Book temp = map.get(b.getIsbn());
		
		System.out.println(temp);

	}

}

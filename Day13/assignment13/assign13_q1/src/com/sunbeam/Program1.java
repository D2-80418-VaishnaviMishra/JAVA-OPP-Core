package com.sunbeam;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
//		Collection<String> c = new ArrayList<>(); //Multiple nulls are allowed
//		Collection<String> c = new HashSet<>(); //Duplicate nulls are not allowed
//		Collection<String> c = new LinkedHashSet<>(); // Duplicate nulls are not allowed
		Collection<String> c = new TreeSet<>(); //Nulls are not allowed
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}

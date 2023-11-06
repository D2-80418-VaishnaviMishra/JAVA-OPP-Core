package com.sunbeam;

public class StringsB {
	public static void main(String[] args) {
		
//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = new StringBuffer("Sunbeam");
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // false
		
//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		String s2 = new String("Sunbeam");
//		System.out.println(s1 == s2); // error
//		System.out.println(s1.equals(s2)); // false
		
//		String s1 = new String("Sunbeam");
//		StringBuffer s2 = new StringBuffer("Sunbeam");
//		System.out.println(s1.equals(s2)); // false
//		System.out.println(s1.equals(s2.toString())); // true // s1 is a string and its equals method is overridden as we are using its equals method the content will be checked.
		
//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = s1.reverse();
//		System.out.println(s1 == s2); // true // this is true because in heap memory s2 and s1 are referring to the same object
//		System.out.println(s1.equals(s2)); // true // same goes for this
		
//		StringBuilder s1 = new StringBuilder("Sunbeam");
//		StringBuilder s2 = new StringBuilder("Sunbeam");
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // false
		
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34, 32
	}
}

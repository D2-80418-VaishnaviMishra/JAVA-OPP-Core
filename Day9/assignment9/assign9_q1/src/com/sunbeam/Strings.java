package com.sunbeam;

public class Strings {
	public static void main(String[] args) {
//		String s1 = "Sunbeam";
//		String s2 = "Sunbeam";
//		System.out.println(s1 == s2); // true
//		System.out.println(s1.equals(s2)); //true
		
//		String s1 = new String("Sunbeam");
//		String s2 = new String("Sunbeam");
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); //true
		
//		String s1 = "Sunbeam";
//		String s2 = new String("Sunbeam");
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // true
		
//		String s1 = "Sunbeam";
//		String s2 = "Sun" + "beam";
//		System.out.println(s1 == s2); // true
//		System.out.println(s1.equals(s2)); // true
		
//		String s1 = "Sunbeam";
//		String s2 = "Sun";
//		String s3 = s2 + "beam";
//		System.out.println(s1 == s3); // false
//		System.out.println(s1.equals(s3)); // true
		
//		String s1 = "Sunbeam";
//		String s2 = new String("Sunbeam").intern();
//		System.out.println(s1 == s2); // true
//		System.out.println(s1.equals(s2)); // true
		
		String s1 = "Sunbeam";
		String s2 = "SunBeam";
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.compareTo(s2)); // 32
		System.out.println(s1.compareToIgnoreCase(s2)); // 0
		
	}
}

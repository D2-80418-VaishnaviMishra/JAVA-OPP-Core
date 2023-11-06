package com.sunbeam;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the name : ");
		String input = sc.next();
		
		
		StringBuffer s1 = new StringBuffer(input);
		String p1 = s1.toString();
		
		String s2 = s1.reverse().toString();
		
		
		if (p1.equalsIgnoreCase(s2)) {
			System.out.println("Yes "+p1+" is a palindrome.");
		} else {
			System.out.println("No "+p1+" is not a palindrome.");
		}
	}

}

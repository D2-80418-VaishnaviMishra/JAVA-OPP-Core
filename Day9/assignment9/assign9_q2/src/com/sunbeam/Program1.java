package com.sunbeam;

public class Program1 {

	public static void main(String[] args) {
		String s1 = "Bank of Maharashtra";
		String[] s2 = s1.split(" ");
		String res = "";
		for (String ele:s2) {
			res+=ele.charAt(0);
		}
		System.out.println(res.toUpperCase());
		
	}

}

package com.sunbeam;

public class Program3 {

	public static void main(String[] args) {
		String s2 = "Example";
		String s1 = s2.toLowerCase();
		StringBuilder res = new StringBuilder("");
		for (int i=0;i<s1.length();i++) {
			if (i%2!=0) {
				Character s = s1.charAt(i);
				res.append(Character.toUpperCase(s));
				System.out.println(res);
			} else {
				res.append(s1.charAt(i));
				System.out.println(res);
			}
		}
		System.out.println(res);

	}

}

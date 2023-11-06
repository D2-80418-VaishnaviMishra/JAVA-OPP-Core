package com.sunbeam;

public class Program2 {

	public static void main(String[] args) {
		String s1 = "this is string";
		String[] s2 = s1.split(" ");
		String res = "";
		for (String ele:s2) {
			res+= ele.substring(0, 1).toUpperCase() + ele.substring(1).toLowerCase() + " ";
		}
		System.out.println(res);

	}

}

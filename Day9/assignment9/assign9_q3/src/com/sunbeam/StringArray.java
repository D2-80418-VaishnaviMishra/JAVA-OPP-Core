package com.sunbeam;

public class StringArray {

	public static void main(String[] args) {
		String[] arr = {"Bhanu Prakash","Ammulu","Shubham","Vivek"};
		for(String ele:arr) {
			if (ele.endsWith("a")||ele.endsWith("A")||ele.endsWith("e")||ele.endsWith("E")||ele.endsWith("I")||ele.endsWith("i")||ele.endsWith("O")||ele.endsWith("o")||ele.endsWith("U")||ele.endsWith("u")) {
				System.out.println(ele);
			}
		}

	}

}

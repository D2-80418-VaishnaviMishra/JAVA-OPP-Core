package com.sunbeam;

import java.util.Scanner;

public class Tester {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for(T e:arr) {
			if (c.compare(e,key)) {
				count+=1;
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Integer [] arr = {44, 77, 99, 22, 55, 66};
//		Integer key = 50;
//		int cnt = countIf(arr, key, (x,y)-> x > y);
//		System.out.println("Count = " + cnt); 
		
		Double[] darr = {55.2,21.1,23.6,55.2,64.2,84.8};
		System.out.println("Enter the Double Value : ");
		Double key1 = sc.nextDouble();
		int count = countIf(darr,key1,(x,y)->x.equals(key1));
		System.out.println("Result : "+count);
	}

}

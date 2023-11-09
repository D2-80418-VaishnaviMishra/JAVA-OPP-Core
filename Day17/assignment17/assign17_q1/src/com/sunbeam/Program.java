package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		Integer res = Stream.iterate(1, x->x+1)
			.limit(num)
			.reduce(1,(a,b)->a*b);
		System.out.println("Factorial is : "+res);
	}

}

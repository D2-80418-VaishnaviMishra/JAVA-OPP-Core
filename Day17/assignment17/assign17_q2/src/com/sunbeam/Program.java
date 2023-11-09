package com.sunbeam;

import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		System.out.println("Sum of 10 random integers using Streams");
//	 Integer num = Stream.generate(() -> Math.random())
//			 .map(e -> Math.round(e*100))
//			.limit(10)
//			
//			.reduce(0,(a,b)->a+b);
		
//		Stream.generate(() -> Math.random())
//	            .map(e -> Math.round(e * 100))
//	            .limit(10)
//	            .reduce(0,(a,b)->a+b);
//			
		
		Integer res = Stream.generate(() -> (int) Math.round(Math.random() * 100))
	            .limit(10)
	            .reduce(0, (a, b) -> a + b);
		System.out.println(res);
			
		
	}

}

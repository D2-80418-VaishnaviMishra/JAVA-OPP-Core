package com.sunbeam;

import java.util.stream.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		IntStream ins = IntStream.rangeClosed(1, 10);
		System.out.println("Sum = " +ins.sum());
		
		IntStream ins1 = IntStream.rangeClosed(1, 10);
		System.out.println("Average = " + ins1.average().getAsDouble());
		
		IntSummaryStatistics stats = IntStream.rangeClosed(1, 10)
				.summaryStatistics();
		System.out.println(stats);
		
		

	}

}

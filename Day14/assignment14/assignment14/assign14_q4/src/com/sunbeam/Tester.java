package com.sunbeam;

import java.util.Scanner;

public class Tester {
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the double value1 : ");
		double do1 = sc.nextDouble();
		System.out.print("Enter the double value2 : ");
		double do2 = sc.nextDouble();
//		calculate(do1,do2,(do1,do2)->do1+do2);
		calculate(do1, do2, (x,y) -> x + y);
		calculate(do1, do2, (x,y) -> x - y);
		calculate(do1, do2, (x,y) -> x * y);
		calculate(do1, do2, (x,y) -> x / y);
	}

}

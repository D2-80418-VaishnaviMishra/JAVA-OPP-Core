package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[3];
		arr[0] = new Labor();
		arr[0].accept(sc);
		arr[1] = new Salesman();
		arr[1].accept(sc);
		arr[2] = new Clerk();
		arr[2].accept(sc);
		for (Employee e:arr) {
			System.out.println(e);
		}
//		arr[3] = new Salesman();
//		arr[3].accept(sc);
//		arr[4] = new Salesman();
//		arr[4].accept(sc);
		Employees emp = new Employees();
		System.out.println(emp.averageSalClerks(arr));
		System.out.println(emp.averageSalLabor(arr));
		System.out.println(emp.averageSalSalesmans(arr));
//		try {
////			arr[0].setName(null);
//		} catch(CustomException message) {
//			System.err.println(message.getMessage());
//			System.out.println("Wrong value: " + message.getValue());
//		}
		
		
	}

}

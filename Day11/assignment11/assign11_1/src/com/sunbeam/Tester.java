package com.sunbeam;

import java.util.Comparator;

public class Tester {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Double[] arr = { 3.3, 5.5, 7.7, 2.2, 4.4 };
		
		class DoubleAscComparator implements Comparator{
			@Override
			public int compare(Object arg0, Object arg1) {
					int diff = ((Double) arg0).compareTo((Double) arg1);
				return diff;
			}
		}
		
		Tester.selectionSort(arr, new DoubleAscComparator());
		for(Double d:arr) {
			System.out.println(d);
		}

	}

}

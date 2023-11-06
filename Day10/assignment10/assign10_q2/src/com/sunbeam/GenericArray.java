package com.sunbeam;

public class GenericArray {
	
	
	
	
	public static <T extends Number>void array(T[] arr){
		T min = arr[0]; // Initialize min with the first element
        for (T ele : arr) {
            if (ele.doubleValue() < min.doubleValue()) { // Compare as double values
                min = ele;
            }
        }
        System.out.println("The minimum value is: " + min);
	}
	
	public static void main(String[] args) {
//		String[] arr1 = new String[] {"Bhanu","Shubham","Vivek"};
//		GenericArray.array(arr1);
		Integer[] arr1 = new Integer[] {1,2,3,4,5,-6};
		GenericArray.array(arr1);
		Double[] arr2 = new Double[] {1.1,2.2,3.3,4.4,5.5,6.6};
		GenericArray.array(arr2);
	}
}

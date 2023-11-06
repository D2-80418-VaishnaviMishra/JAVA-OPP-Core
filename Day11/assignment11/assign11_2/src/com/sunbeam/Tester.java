package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {

	public static void main(String[] args) {
		
		Student[] arr = new Student[] {
				new Student(7, "Nilesh", "Pune", 76.9),
				new Student(3, "Nilesh", "Hyderabad", 71.4),
				new Student(6, "Rajiv", "Dhanbad", 87.13),
				new Student(2, "Nitin", "Kollapur", 93.0),
				new Student(4, "Prashant", "UP", 54.4),
				new Student(5, "Prashant", "AP", 25.8),
			};
		
//		The 1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
//		3rd level sorting should be on name (asc).
		
		class StudentCityComparator implements Comparator<Student>{
			@Override
			public int compare(Student s1, Student s2) {
				int diff = -s1.getCity().compareTo(s2.getCity());
				if (diff==0)
						diff = -((Double)s1.getMarks()).compareTo((Double)s2.getMarks());
				if (diff==0)
					diff = s1.getCity().compareTo(s2.getCity());
				return diff;
			}
		}
		
		Arrays.sort(arr, new StudentCityComparator());
		System.out.println("After Sort by city DESC, marks DESC, city ASC");
		for (Student s : arr)
			System.out.println(s);
		
	}

}

package com.sunbeam;

import java.util.*;

public class PriorityQ {

	public static void main(String[] args) {
		
		class EmployeeComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee arg0, Employee arg1) {
				int diff = Integer.compare(arg0.getEmpid(), arg1.getEmpid());
				return -diff;
			}
			
		}
		
		Queue<Employee> pQ = new PriorityQueue<>(new EmployeeComparator());
		pQ.offer(new Employee(1,"bhanu",15000));
		pQ.offer(new Employee(2,"vivek",10000));
		pQ.offer(new Employee(3,"shubham",5000));
		
		while(!pQ.isEmpty()) {
			Employee emp = pQ.poll();
			System.out.println("Popped : "+emp);
			
		}
		
	}
}


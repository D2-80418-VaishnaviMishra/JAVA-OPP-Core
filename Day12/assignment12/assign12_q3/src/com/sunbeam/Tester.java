package com.sunbeam;

import java.util.*;

public class Tester {
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("=====================================");
		System.out.println("0. Exit");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Find Employee");
		System.out.println("4. Sort Employee");
		System.out.println("5. Edit Employee");
		System.out.println("6. Display ");
		System.out.println("=====================================");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> lList = new LinkedList<Employee>();
		int choice;
		while ((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				Employee emp = new Employee();
				emp.accept();
				lList.add(emp);
				
//				lList.offer(Employee emp);
				break;
			case 2:
				System.out.println("Enter the empid to be deleted : ");
				int tempEmpId = sc.nextInt();
				Employee empTemp = new Employee();
				empTemp.setEmpid(tempEmpId);
				int index = lList.indexOf(empTemp);
				lList.remove(index);
				System.out.println("Employee removed successfully.");
				break;
			case 3:
				System.out.println("Enter the empid to be found : ");
				int tempEmpId1 = sc.nextInt();
				Employee empTemp1 = new Employee();
				empTemp1.setEmpid(tempEmpId1);
				int index1 = lList.indexOf(empTemp1);
				if (index1==-1) {
					System.out.println("Employee not found");
				} else {
					System.out.println(lList.get(index1));
				}
				break;
			case 4:
				Collections.sort(lList);
				System.out.println("Employees sorted succesfully");
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setEmpid(id);
				int index3 = lList.indexOf(key);
				if(index3 == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = lList.get(index3);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept();
				lList.set(index3, newEmp);
				}
				break;
			case 6:
				for(Employee e:lList) {
					System.out.println(e);
				}
				break;
			default:
				System.out.println("Enter the correct choice........");
				break;
			}
			
		}

	}

}
 
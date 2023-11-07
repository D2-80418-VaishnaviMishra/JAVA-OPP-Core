package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class Tester {

	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("====================================");
		System.out.println("1. Insert new user (Voter)");
		System.out.println("2. Display all users");
		System.out.println("3. Delete voter with given id");
		System.out.println("4. Change status of voter with given id to true");
		System.out.println("5. Change the name and birth date of voter");
		System.out.println("====================================");
		System.out.print("Enter you choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				try (UsersDAO ud = new UsersDAO()){
					System.out.print("Enter first name : ");
					String fname = sc.next();
					System.out.print("Enter last name : ");
					String lname = sc.next();
					System.out.print("Enter email : ");
					String email = sc.next();
					System.out.print("Enter password : ");
					String password = sc.next();
					System.out.print("Enter DOB(DD-MM-YYYY) : ");
					String dob = sc.next();
					System.out.print("Enter the status : ");
					boolean status = sc.nextBoolean();
					Users u = new Users(0,fname,lname,email,password,dob,status,"voter");
					int count = ud.addUser(u);
					System.out.println("Rows Affected : "+count);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
			case 2:
				try (UsersDAO ud = new UsersDAO()){
					List<Users> list = ud.displayAll();
					for(Users u:list) {
						System.out.println(u);
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try (UsersDAO ud = new UsersDAO()){
					System.out.print("Enter the id : ");
					int id = sc.nextInt();
					int count = ud.deleteVoter(id);
					System.out.println("Rows Affected : "+count);
				} catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try (UsersDAO ud = new UsersDAO()){
					System.out.print("Enter the id : ");
					int id = sc.nextInt();
					int count = ud.changeStatus(id);
					System.out.println("Rows Affected : "+count);
				} catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try (UsersDAO ud = new UsersDAO()){
					System.out.print("Enter the id : ");
					int id = sc.nextInt();
					System.out.print("Enter first name : ");
					String fname = sc.next();
					System.out.print("Enter last name : ");
					String lname = sc.next();
					System.out.print("Enter DOB(DD-MM-YYYY) : ");
					String dob = sc.next();
					ud.changeVoter(id,fname,lname,dob);
				} catch(Exception e) {
					e.printStackTrace();
				}
				break;

			default:
				break;
			}
		}
				
	}

}

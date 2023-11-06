package com.sunbeam;

import java.util.Scanner;

enum Gender{
	MAIN_MENU,MALE,FEMALE
}

enum Menu{
	ADD_PERSON,DISPLAY_ALL,FIND_PERSON,EXIT
}

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of People data to store : ");
		int size = sc.nextInt();
		Person[] p = new Person[size];
		int count = 0;
		Menu[] menu = Menu.values();
		for (Menu m:menu) {
			System.out.println(m.ordinal()+". "+m.name());
		}
		System.out.print("Enter your choice : ");
		int choice1 = sc.nextInt();
		Menu menu1 = menu[choice1];
		
		while (menu1 != Menu.EXIT) {
			Menu[] menu = Menu.values();
			for (Menu m:menu) {
				System.out.println(m.ordinal()+". "+m.name());
			}
			System.out.print("Enter your choice : ");
			int choice1 = sc.nextInt();
			Menu menu1 = menu[choice1];
		    switch (menu1) {
		        case ADD_PERSON:
		            Gender[] arr = Gender.values();
		            for (Gender g : arr)
		                System.out.println(g.ordinal() + ". " + g.name());
		            System.out.print("Enter your choice: ");
		            int choice = sc.nextInt();

		            Gender gen = arr[choice];

		            while (gen!=Gender.MAIN_MENU) {
		            switch (gen) {
		                case MALE:
		                    p[count] = new Person();
		                    p[count].accept(Gender.MALE);
		                    count++;
		                    break;

		                case FEMALE:
		                    p[count] = new Person();
		                    p[count].accept(Gender.FEMALE); // Use Gender.FEMALE here
		                    count++;
		                    break;

		                default:
		                    break;
		            }
		            }
		            // Exit the ADD_PERSON menu after data entry
//		            menu1 = Menu.MAIN_MENU;
//		            menu1 = Menu.INVALID_OPTION;
		            break;
		        case DISPLAY_ALL:
		            for (Person per : p) {
		                if (per != null) {
		                    per.toString();
		                }
		            }
		            break;

		        case FIND_PERSON:
		            System.out.println("Enter the name of the Person : ");
		            String name = sc.next();
		            boolean bool = true;
		            for (Person per : p) {
		                if (per != null && per.getName().equals(name)) {
		                    per.toString();
		                    bool = false;
		                    break;
		                }
		            }
		            if (bool) {
		                System.err.println("Person not found");
		            }
		            break;

		        default:
		            System.out.println("Enter the correct choice..");
		            break;
		    }
		}

		System.out.println("Bye.....");
		
	}
}


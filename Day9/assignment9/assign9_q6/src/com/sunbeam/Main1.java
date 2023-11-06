package com.sunbeam;

import java.util.Scanner;

enum Gender {
    MALE, FEMALE
}

class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[100]; // Create an array to store Person objects
        int count = 0; // Keep track of the number of people in the array

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new person");
            System.out.println("2. Display all people");
            System.out.println("3. Find a person by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine(); // Consume the newline character
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.println("Select gender (0 for MALE, 1 for FEMALE):");
                    int genderChoice = sc.nextInt();
                    Gender gender = Gender.values()[genderChoice];
                    people[count] = new Person(name, age, gender);
                    count++;
                    System.out.println("Person added successfully!");
                    break;

                case 2:
                    System.out.println("All People:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(people[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter the name to find: ");
                    sc.nextLine(); // Consume the newline character
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (people[i].getName().equals(searchName)) {
                            System.out.println("Person found: " + people[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Person not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}


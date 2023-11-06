package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		Person person = new Person("John", 30);
        Book book = new Book("Sample Book", "Author Name");
        Car car = new Car("Toyota", "Camry");

        // Call non-generic methods to display and print as a string
        printDisplayableBox(person);
        printAnyBox(book);
        printAnyBox(car);

	}
	public static void printDisplayableBox(Displayable b) {
        b.display();
    }

    public static void printAnyBox(Object b) {
        System.out.println(b.toString());
    }

}

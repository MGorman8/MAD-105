package com.example.java;

public class Main {

    // Main - instantiating and calling 3 employee objects
    public static void main(String[] args) {
	    Employee employee1 = new Employee(1, "Charlie", "Karalus", 1);
        Employee employee2 = new Employee(2, "Braden", "Thomas", 2);
        Employee employee3 = new Employee(3, "Sam", "Fish", 3);

        // print employee's information
        System.out.println("Employees");
        employee1.printAll();
        System.out.println();
        employee2.printAll();
        System.out.println();
        employee3.printAll();
    }
}

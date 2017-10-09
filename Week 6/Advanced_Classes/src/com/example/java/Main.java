package com.example.java;

import com.example.java.Employee;


public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Braden Thomas","ADMINISTRATION",true,30.00,
                1);
        Employee emp2 = new Employee("Sara Connor", "TECHNICAL",false,10.00,
                2);
        Employee emp3 = new Employee("Bob Hope", "Sales", false,27.85,3);

        emp1.display();
        emp1.calculate(45);
        emp2.display();
        emp2.calculate(50);
        emp3.display();
        emp3.calculate(35);
    }
}

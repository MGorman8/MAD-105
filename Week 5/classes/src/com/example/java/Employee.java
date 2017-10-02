package com.example.java;

// Employee class
public class Employee {

    // items contained in the class - definition of the class
    private long employeeID;
    private String firstName;
    private String lastName;
    private int shift;

    // constructor
    public Employee(long employeeID, String firstName, String lastName, int shift) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shift = shift;
    }

    // getters and setters
    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    // allows the printing to the screen the employee's information
    public void printAll(){
        System.out.println("Employee ID number: " + employeeID + "\n" + "First Name: " +
                firstName + "\n" + "Last Name: " + lastName + "\n" + "Shift worked: " + shift);
    }
}

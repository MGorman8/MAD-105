package com.example.java;



// Employee class
public class Employee {

    // items contained in the class - definition of the class
    private String employeeName;
    private String Position;
    private boolean salary;
    private double payRate;
    private int shift;

    // constructor

    public Employee(String employeeName, String position, boolean salary, double payRate, int shift) {
        this.employeeName = employeeName;
        Position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
    }


    // getters and setters

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    // allows the printing to the screen the employee's information
    public void display(){
        System.out.println("Employee Name:     " + employeeName + "\n" +"Job title:         " + Position + "\n" +
                "Shift worked:      " + shift + "\n" + "Salary T/F:        " + salary + "\n" + "Pay rate per hour: "
                + payRate);
    }

    public void calculate(double hours) {
        double differential = 0;
        switch (shift) {
            case 1:
                differential = 0;
                break;
            case 2:
                differential = payRate * .05;
                break;
            case 3:
                differential = payRate * .1;
                break;
        }
        double over_time = 0;
        if (salary) {
            hours = 40;
            over_time = 0;
        }
        if (hours > 40) {
            over_time = hours - 40;
            hours = (hours + (over_time * 1.5));
        }

        double pay = payRate + differential;
        double weekly_pay = (pay * hours);
        System.out.println("Pay for this week is: " +(java.text.NumberFormat.getCurrencyInstance().format(weekly_pay)));
        System.out.println();
    }
}
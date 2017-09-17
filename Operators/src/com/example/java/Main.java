package com.example.java;

public class Main {

    public static void main(String[] args) {
        // Variables
        int x = 5;
        int y = 8;
        int z = 3;

        // variables to store answers
        int a1;
        int a2;
        int a3;
        float a4;
        float a5;

        // execute operator statements
        a1 = x + x;
        a2 = y - x;
        a3 = x * x;
        a4 = y / z;
        a5 = x % z;

        // display operator statements
        System.out.println("5 + 5 = " + a1);
        System.out.println("8 - 5 = " + a2);
        System.out.println("5 * 5 = " + a3);
        System.out.println("8 / 3 = " + a4);
        System.out.println("5 % 3 = " + a5);
    }
}

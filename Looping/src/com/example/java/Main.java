package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variable for user input
        int choice;
        Scanner scanner = new Scanner(System.in);

        // Get user input and display choice
        System.out.println("Welcome to the Internet balloon kiosk.");

        do {
            System.out.println("What color balloon would you like?");
            System.out.println("Enter 1 for RED");
            System.out.println("Enter 2 for BLACK");
            System.out.println("Enter 3 for BLUE");
            System.out.println("Enter 4 for YELLOW");
            System.out.println("Enter 5 for GREEN");
            System.out.println("Enter 6 for No balloon");
            choice = scanner.nextInt();
        }while(choice != 1 && choice != 2 && choice!= 3 && choice != 4 && choice != 5 && choice != 6);

        switch (choice) {
            case 1:
                System.out.println("You chose a RED balloon!");
                break;
            case 2:
                System.out.println("You chose a BLACK balloon!");
                break;
            case 3:
                System.out.println("You chose a BLUE balloon!");
                break;
            case 4:
                System.out.println("You chose a YELLOW balloon!");
                break;
            case 5:
                System.out.println("You chose a GREEN balloon!");
                break;
                default:
                    System.out.println("You chose no balloon.");

        }
    }
}

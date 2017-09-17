package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Variable for user input
       // int x = 1;
        Scanner scanner = new Scanner(System.in);

    // Get user input and display German translation
        System.out.println("Enter a whole number between 1 and 10 you would like translated to German. :");
        int x = scanner.nextInt();

        switch (x){
            case 1:
                System.out.println("The number one in German is eins.");
                break;
            case 2:
                System.out.println("The number two in German is zwei.");
                break;
            case 3:
                System.out.println("The number three in German is drei.");
                break;
            case 4:
                System.out.println("The number four in German is vier.");
                break;
            case 5:
                System.out.println("The number five in German is funf.");
                break;
            case 6:
                System.out.println("The number six in German is sechs.");
                break;
            case 7:
                System.out.println("The number seven in German is sieben.");
                break;
            case 8:
                System.out.println("The number eight in German is acht.");
                break;
            case 9:
                System.out.println("The number nine in German is neun.");
                break;
            case 10:
                System.out.println("The number ten in German is zehn.");
                break;
            default:
                System.out.println("That was not a whole number between 1 and 10.");
        }
    }
}

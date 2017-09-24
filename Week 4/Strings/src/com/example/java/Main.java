package com.example.java;
import java.util.Scanner;       // needed for user input
public class Main {

    public static void main(String[] args) {

        int correct = 0;  // variable for counting correct answers
        String guess;     // variable to hold users guess
        Scanner guessScanner = new Scanner(System.in);   // needed for user input
        System.out.println("How well do you know the Chicago Blackhawks???");
        System.out.println("I'm going to give you a number, you must type the last name of the " +
                "player who wears said number.");

        String str19 = "Toews"; // variable to hold correct answer
        System.out.println("19"); // question
        guess = guessScanner.next(); // user guess
        if (str19.equalsIgnoreCase(guess)) {  // compare correct answer to user guess
            System.out.println("You are correct!!");
            correct ++;     // increment counter
        } else {
            System.out.println("That is not correct.");
        }
        String str88 = "Kane";
        System.out.println("88");
        guess = guessScanner.next();
        if (str88.equalsIgnoreCase(guess)) {
            System.out.println("You are correct!!");
            correct ++;
        } else {
            System.out.println("That is not correct.");
        }
        String str10 = "Sharp";
        System.out.println("10");
        guess = guessScanner.next();
        if (str10.equalsIgnoreCase(guess)) {
            System.out.println("You are correct!!");
            correct ++;
        } else {
            System.out.println("That is not correct.");
        }
        String str20 = "Saad";
        System.out.println("20");
        guess = guessScanner.next();
        if (str20.equalsIgnoreCase(guess)) {
            System.out.println("You are correct!!");
            correct ++;
        } else {
            System.out.println("That is not correct.");
        }
        String str2 = "Keith";
        System.out.println("2");
        guess = guessScanner.next();
        if (str2.equalsIgnoreCase(guess)) {
            System.out.println("You are correct!!");
            correct ++;
        } else {
            System.out.println("That is not correct.");
        }

        System.out.println("The quiz is over.\n");
        System.out.println("You correctly answered " +correct+ " out of 5.");
    }
}

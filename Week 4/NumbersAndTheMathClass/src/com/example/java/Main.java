package com.example.java;

import java.util.Scanner;       // needed for user input

public class Main {

    public static void main(String[] args) {
	// Not being able to put ALL my variables in one spot is KILLING ME
        double item = 0;                                // price of each item
        double total = 0.00;                            // cumulative total price of each item

        Scanner itemScanner = new Scanner(System.in);   // needed for user input


        System.out.println("This calculator will help you determine how much to tip.");
        System.out.println("Please enter the cost of each item purchased. When finished enter 0.");
        System.out.println("What is the cost of the first item? :");

        item = itemScanner.nextDouble(); // get user input
        total += item;                   // add item to total and set new total

        // loop to end user input
        do{
            System.out.println("What is the cost of the next item? :");
            item = itemScanner.nextDouble();    // get user input
            total += item;                      // add item to total and set new total
        }while (item != 0); // if user input = 0 end loop

        double tax = total * .025;              // calculate tax owed
        double taxTotal = (total + tax);        // add tax to total
        double tip = (.175 * taxTotal);         // calculate tip
        double grandTotal = (taxTotal + tip);   // add tip to total

        // display final bill information
        // (java.text.NumberFormat.getCurrencyInstance().format()) format for currency
        System.out.println("Your total bill is " +(java.text.NumberFormat.getCurrencyInstance().format(total)));
        System.out.println("The tax on your bill is " +(java.text.NumberFormat.getCurrencyInstance().format(tax)));
        System.out.println("Your total with tax is " + (java.text.NumberFormat.getCurrencyInstance().format(taxTotal)));
        System.out.println("The recommended tip on this bill is " +(java.text.NumberFormat.getCurrencyInstance().format(tip)));
        System.out.println("Your grand total comes to " + (java.text.NumberFormat.getCurrencyInstance().format(grandTotal)));
    }

}

package com.example.java;
import java.util.Scanner;  // needed for scanner...ie.. to get user input

public class Main {


    public static void main(String[] args) {
        // Variables ..... Java not having 'Global' variables is really annoying
        Scanner scanCustomer = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        Scanner scanContactName = new Scanner(System.in);
        Scanner scanPhone = new Scanner(System.in);
        int customer;



        // intro
        System.out.println("Thank you for choosing Smaug's Internet!!");
        System.out.println("Are you needing business internet or residential?.");

        // do/while loop for user input and validation
        do {
            System.out.println("If you would like a business account please press 1.");
            System.out.println("If you would like a residential account please press 2.");

            customer = scanCustomer.nextInt();
        }while (customer != 1 && customer != 2);

        // execute formulas
        switch (customer){
            case 1:
                System.out.println("What business is the account for? ");
                String name = scanName.nextLine();
                System.out.println("Who is the contact person? ");
                String contactName = scanContactName.next();
                System.out.println("What is the best contact phone number? ");
                String phone = scanPhone.next();
                contactInfo(name, contactName, phone);
                break;
            case 2:
                System.out.println("What will the name on the account be? ");
                String name2 = scanName.nextLine();
                System.out.println("What is your phone number?");
                String phone2 = scanPhone.nextLine();
                contactInfo(name2, phone2);
                break;

        }


    }

    // methods/functions

    static void contactInfo(String name, String contactName, String phone){
        // function body
        System.out.println("Your account for " + name + " is all set up.");
        System.out.println(contactName + " is the contact for this account.");
        System.out.println("The account's contact phone number is " + phone + ".");
    }
    static void contactInfo(String name2, String phone2) {
        // function body
        System.out.println("Thank you " + name2 + ", your account is ready.");
        System.out.println("If we need to contact you, we will call " + phone2 + ".");
    }
}

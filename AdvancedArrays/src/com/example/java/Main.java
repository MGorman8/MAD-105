package com.example.java;
import java.util.Scanner;  // needed for scanner...ie.. to get user input

public class Main {

    public static void main(String[] args) {
        // Variables
        Scanner scanEdit = new Scanner(System.in);
        Scanner scanItem = new Scanner(System.in);
        Scanner scanChange = new Scanner(System.in);
        int edit;
        String item;
        int change;
        int newTotal;


        // declare parallel arrays
            // string array filled with names
        String[] inventory = {"Brushes", "Rollers", "Black Paint", "White Paint", "Red Paint"};
            // int array filled with starting quantities
        int[] quantity = {10, 6, 8, 8, 8};

 
        // print inventory
        System.out.println("Bob's Basic Paints inventory:");
        System.out.println("Item name \t Quantity");
        for (int i = 0; i < inventory.length; i++){
            // formatted for neatness
            System.out.printf("%-17s%-17s\n",inventory[i],quantity[i]);
        }

        // allow for changing the quantity of the inventory

        do{
            System.out.println("Do you need to change the inventory? Press 1 for Yes or 2 for No:");
            edit = scanEdit.nextInt();

        }while (edit != 1 && edit != 2);

        switch (edit) {
            case 1:
                System.out.println("Which item would you like to change the quantity of?");
                item = scanItem.nextLine();

                System.out.println("Enter the amount you added or removed from inventory. " +
                    "If you added five enter '5' or if you removed five enter '-5'.");
                change = scanChange.nextInt();
                // had int j = 0; j < inventory.length; j++
                // and it WOULD NOT WORK
                for (int j = 0; j < 4; j++) {
                    if (inventory[j].equals (item)){
                        System.out.println(item);
                        if ((quantity[j] + change) > 0) {
                            newTotal = quantity[j] + change;
                            quantity[j] = newTotal;
                        } else {
                            quantity[j] = 0;
                            System.out.println("You can't have a negative inventory. That item is set to '0'.");
                        }
                    }
                }
                // print inventory again for clarity
                System.out.println("Bob's Basic Paints ending inventory:");
                System.out.println("Item name \t Quantity");
                for (int i = 0; i < inventory.length; i++) {
                    // formatted for neatness
                    System.out.printf("%-17s%-17s\n", inventory[i], quantity[i]);
                }
                break;
            case 2:
                System.out.println("Bob's Basic Paints ending inventory:");
                System.out.println("Item name \t Quantity");
                for (int i = 0; i < inventory.length; i++) {
                    // formatted for neatness
                    System.out.printf("%-17s%-17s\n", inventory[i], quantity[i]);
                }
                    System.out.println("Good bye!");
                break;

        }

    }
}

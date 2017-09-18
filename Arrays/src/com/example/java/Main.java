package com.example.java;

public class Main {

    public static void main(String[] args) {
	// declare array
        String[] inventory = {"Brushes", "Rollers", "Black Paint", "White Paint", "Red Paint"};

    // print inventory
        System.out.println("Bob's Basic Paints inventory:");
        for (int i = 0; i < inventory.length; i++){
            System.out.println(inventory[i]);
        }
    }
}

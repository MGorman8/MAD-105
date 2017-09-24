package com.example.java;

// imports needed for date and time
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
	// next full moon for Chicago is Oct 5 at 1:40 pm
    // average lunar cycle is 29.530588 days


        LocalDate today = LocalDate.now();  // variable 'today' for today's date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy"); // set date format
        String textToday = today.format(formatter); // make today's date a string
        System.out.println("Today is " + textToday); // display today's date formatted

        // assign next full moon date
        int moonMonth = 10;
        int moonDay = 5;
        int moonYear = today.getYear();
        LocalDate fullMoon = LocalDate.of(moonYear, moonMonth, moonDay);

        // apply formatting to full moon date.
        String textMoon = fullMoon.format(formatter);
        System.out.println("The next full moon is on " + textMoon);

        // get number of days between now and full moon
        long daysLeft = Period.between(today, fullMoon).getDays();
        System.out.println("There are " + daysLeft +" days left.");
    }
}

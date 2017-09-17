package com.example.java;
import java.util.Scanner;  // needed for scanner...ie.. to get user input
import java.text.DecimalFormat;  // needed for decimal formatting
public class Main {

    private static DecimalFormat df2 = new DecimalFormat(".##"); // needed for decimal formatting
    public static void main(String[] args) {
        // Variables ..... Java not having 'Global' variables is really annoying
        Scanner scanShape = new Scanner(System.in);
        int shape;


        // intro
        System.out.println("Welcome to Handy Manny's Handy Area Helper!!");
        System.out.println("You can choose one of five shapes and we will help you figure out it's area.");

        // do/while loop for user input and validation
        do {
            System.out.println("If you would like a help with a rectangle or square choose 1.");
            System.out.println("If you would like a help with a triangle choose 2.");
            System.out.println("If you would like a help with a parallelogram choose 3.");
            System.out.println("If you would like a help with a circle choose 4.");
            System.out.println("If you would like a help with a trapezoid choose 5.");
            System.out.println("What is your choice? :");
            shape = scanShape.nextInt();
        }while (shape != 1 && shape != 2 && shape != 3 && shape != 4 && shape != 5);

        // execute formulas
        switch (shape){
            case 1:
                areaRectangle();
                break;
            case 2:
                areaTriangle();
                break;
            case 3:
                areaParallelogram();
                break;
            case 4:
                areaCircle();
                break;
            case 5:
                areaTrapezoid();
                break;
        }

    }   // end of main
    
        // methods/functions

    static void areaRectangle(){
        //function variables
        double longSide;
        double otherSide;
        double area;
        Scanner scanLongSide = new Scanner(System.in);
        Scanner scanOtherSide = new Scanner(System.in);
        // function body
        System.out.println("What is the length of the long side? ");
        longSide = scanLongSide.nextDouble();
        System.out.println("What is the length of the short side? ");
        otherSide = scanOtherSide.nextDouble();
        area = (longSide * otherSide);
        System.out.println("The area of your rectangle is " + df2.format(area));
    }
    static void areaTriangle(){
        //function variables
        double longSide;
        double height;
        double area;
        Scanner scanLongSide = new Scanner(System.in);
        Scanner scanHeight = new Scanner(System.in);
        // function body
        System.out.println("What is the length of the long side? ");
        longSide = scanLongSide.nextDouble();
        System.out.println("What is the height? ");
        height = scanHeight.nextDouble();
        area = (longSide * height * .5);
        System.out.println("The area of your triangle is " + df2.format(area));
    }
    static void areaParallelogram(){
        //function variables
        double longSide;
        double height;
        double area;
        Scanner scanLongSide = new Scanner(System.in);
        Scanner scanHeight = new Scanner(System.in);
        // function body
        System.out.println("What is the length of the long side? ");
        longSide = scanLongSide.nextDouble();
        System.out.println("What is the height? ");
        height = scanHeight.nextDouble();
        area = (longSide * height);
        System.out.println("The area of your parallelogram is " + df2.format(area));
    }
    static void areaCircle(){
        //function variables
        double radius;
        double area;
        Scanner scanRadius = new Scanner(System.in);
        // function body
        System.out.println("What is the radius of the circle? ");
        radius = scanRadius.nextDouble();
        area = ((radius * radius) * Math.PI);  // Math.PI gives value for PI
        System.out.println("The area of your circle is " + df2.format(area));
    }
    static void areaTrapezoid() {
        //function variables
        double longSide;
        double otherSide;
        double height;
        double area;
        Scanner scanLongSide = new Scanner(System.in);
        Scanner scanOtherSide = new Scanner(System.in);
        Scanner scanHeight = new Scanner(System.in);
        // function body
        System.out.println("What is the length of the long side? ");
        longSide = scanLongSide.nextDouble();
        System.out.println("What is the length of the parallel side? ");
        otherSide = scanOtherSide.nextDouble();
        System.out.println("What is the height? ");
        height = scanHeight.nextDouble();
        area = ((.5 * (longSide + otherSide)) * height);
        System.out.println("The area of your rectangle is " + df2.format(area));
    }

}

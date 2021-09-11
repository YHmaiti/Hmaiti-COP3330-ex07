/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program calculates the area of a room.
// Prompt the user for the length and width of the room in feet.
// Then display the area in both square feet and square meters.

package org.example;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {

        // use DecimalFormat to format the decimal numbers
        // obtained through the program as expected from the assignment
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        // create a constant variable for the conversion factor
        // that will be used in our calculation
        final double conversionConstant = 0.09290304;

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the length and width and store them
        // in their respective variables
        System.out.print("What is the length of the room in feet? ");
        int length = Integer.valueOf(scanner.nextLine());
        System.out.print("What is the width of the room in feet? ");
        int width = Integer.valueOf(scanner.nextLine());

        // print the length and width as described by the assignment
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        // calculate the area and print it according to the assignment description
        int area = width * length;
        System.out.println("The area is ");
        System.out.println(area + " square feet");

        // convert the area to square meters using the following equation
        double areaInSqMeters = area * conversionConstant;

        // print the converted value of the area as described by the assignment
        // through using the Decimal formatter
        System.out.print((df.format(areaInSqMeters)) + " square meters");

    }

}
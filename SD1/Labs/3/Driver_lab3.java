/**
  * file: Drive_lab3.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file will calculate the distance between points input by a user.
  */

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args) {
    // Imports a scanner
    Scanner input = new Scanner(System.in);
      // Allows the program to run up to 1000 times
      for(int i = 0; i <= 1000; i++) {
        // Defines the first x value from the user
        double x1 = input.nextDouble();
        // Checks if the user input is valid
        if (x1 == 0)
          break;
        // User input for the rest of the variables
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double p = input.nextDouble();
        // Math equation to find the distance between two points
        double distance = Math.pow(Math.pow(Math.abs(x1-x2),p) + 
          Math.pow(Math.abs(y1-y2),p), 1/p);
        // Prints out the distance
        System.out.println(distance);
      }
  }
}
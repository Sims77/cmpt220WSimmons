/**
  * file: Problem_913.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 8
  * due date: April 18, 2017
  * version: 1
  *
  * This file prompts the user to enter a two dimensional
  * array based on the amount of rows and columns of 
  * their choosing. It then finds the largest number
  * in the array and the location if it
  */

import java.util.Scanner;

public class Problem_913 {
  public static void main(String[] args) {
    // Creates a scanner
    Scanner input = new Scanner(System.in);
    
    // Asks the user for the rows and columns then defines the values
    System.out.print("Please enter the rows and columns for the array: ");
    int rows = input.nextInt();
    int cols = input.nextInt();

    // Defines the array based on input by the user
    double[][] array = new double[rows][cols];
    System.out.println("Enter values for the array: ");
    // Creates the array based on the users input information
    for (int i = 0; i < array.length; i++) {
      for( int j = 0; j < array[i].length; j++) {
        array[i][j] = input.nextDouble();
      }
    }
    // Locates the max value and displays the answer to the user
    Location max = locateLargest(array);
    System.out.println("The largest value is " + max.maxValue + 
      " at the location (" + max.row + ", " + max.col + ")");
  }
  // Creating a location class
  public static class Location {
    // Defining variables for the array
    int row;
    int col;
    double maxValue;
    
    // Creates a default location object
    Location(double[][] a) {
      // Defines the default location object
      maxValue = a[0][0];
      row = 0;
      col = 0;
      // Finds the max value for the default location object
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++){
          if (a[i][j] > maxValue) {
            maxValue = a[i][j];
            row = i;
            col = j;
          }
        }
      }
    }
  }
  // Returns the max value in the array at a certain location
  public static Location locateLargest(double[][] a) {
    return new Location(a);
  }
}

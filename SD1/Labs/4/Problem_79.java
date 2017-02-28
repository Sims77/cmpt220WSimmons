/**
  * file: Problem_79.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file promts for a user to input ten numbers that
  * can be integers or doubles. The program then tells the 
  * user which number is the smallest.
  */

import java.util.Scanner;

public class Problem_79 {
  public static void main(String[] args) {
    // Creates a new scanner.
    Scanner input = new Scanner(System.in);
    // Creates a string of 10.
    double[] usernum = new double[10];
      // Prompts user to enter numbers.
      System.out.print("Enter 10 numbers: ");
      // Observes each number and puts them into a string.
      for(int i = 0; i < usernum.length; i++) {
        usernum[i] = input.nextDouble();
      }
    // Prints the minimum number in the string.
    System.out.println("The minimum number you entered is: " + min(usernum));
  }
  public static double min(double[] array) {
    // Defines the array.
    double min = array[0];
    // Determines which number is the minimum.
    for(int i = 0; i < array.length; i++) {
      if(min > array[i]) min = array[i];
    }
    // Returns the smallest number in the string.
    return min;
  }
}
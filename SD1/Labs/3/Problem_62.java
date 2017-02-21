/**
  * file: Problem_62.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file will calculate the sum of digits in an integer.
  */

import java.util.Scanner;

public class Problem_62 {
  public static void main(String[] args) {
    // Imports a scanner
    Scanner input = new Scanner(System.in);
      // Prompts a user for an integer
      System.out.print("Enter an integer: ");
      // Defines the user input
      long num = input.nextLong();
      // Prints statement of the sum of digits in that integer
      System.out.println("The sum of digits of " + num + 
        " is " + sumOfDigits(num));

  }
  public static long sumOfDigits(long n) {
    // Defines the sum variable
    int sum = 0;
    // Checks the integer and adds up its variables
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    // returns the sum of digits back
    return sum;
  }
}
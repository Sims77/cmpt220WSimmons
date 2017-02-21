/**
  * file: Problem_512.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file will calculate then find the smallest integer where
  * n^2 is greater than 12,000.
  */

public class Problem_512 {
  public static void main(String[] args) {
    // Defines the variable for the number
    int num = 0;
    // While statment to determine the lowest number squared above 12000
    while (Math.pow(num, 2) < 12000) {
      // Increases the original number if not above 12000
      num++;
    }
    // Prints out the correct number
    System.out.println("The lowest number squared above 12000: " + num);
  }
}
/**
  * file: Problem_513.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file will calculate then find the largest integer where
  * n^3 is less than 12,000.
  */

public class Problem_513 {
  public static void main(String[] args) {
    // Defines the number
    int num = 0;
    // While statment to check the largest number cubed below 12000
    while (Math.pow(num + 1, 3) < 12000) {
      // Increases number if it is not above 12000
      num++;
    }
    // Prints the correct number
    System.out.println("The largest number cubed below 12000: " + num);
  }
}
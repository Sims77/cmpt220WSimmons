/**
  * file: Problem_45.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file has a user input two numbers,
  * one for the number of sides of a regular
  * polygon and one for the length of the side.
  * Then it calculates the area of that shape.
  */

import java.util.Scanner;

public class Problem_45 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      // This prompts the user to input number of sides for a polygon
      // then defines it. 
      System.out.print("Please enter the number of sides: ");
      int userside = input.nextInt();
      // This prompts the user to input a number for the length of
      // each side then defines it. 
      System.out.print("Please enter the side length: ");
      double length = input.nextDouble();
      // This is the equation for the polygon based on the users inputs.
      double area = (userside * (length * length))
        / (4 * (Math.tan(Math.PI / userside)));
      // This prints out what the area is based on the number of 
      // sides and length of those sides.
      System.out.println("The area of a polygon with " + userside + 
        " sides at a length of " + length + " is " + area);
  }
}
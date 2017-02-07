/**
  * file: Problem_41.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file has the user to enter a three digit
  * integer and then uses a lottery system and determines
  * how much money they have won depending on how many
  * of their number's match the lottery ones.
  */
import java.util.Scanner;

public class Problem_41 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      // This prompts the user to input a radius for a pentagon.
      System.out.print
      ("Enter a length from the center of a pentagon to a vertex ");
      // These define each variable in the area equation.
      double radius = input.nextDouble();
      double side = (2 * radius) * Math.sin(Math.PI / 5);
      double area = (5 * (side * side)) / (4 * Math.tan(Math.PI / 5));
      // This prints out the area base on the radius and side prompted
      // by the user.
      System.out.println("The area of a pentagon with a "
        + radius + " radius is " + area);
  }
}
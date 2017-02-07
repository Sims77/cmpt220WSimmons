/**
  * file: Problem_38.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file has a user input three different
  * integers and will display them from lowest
  * to highest. 
  */
import java.util.Scanner;

public class Problem_38 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Please Enter Three Integers: ");
      // This defines the three numbers the user enters.
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int num3 = input.nextInt();
      int temporary;
      // This if states puts the numbers in ascending order.
        if (num2 < num1 || num3 < num1) {
          
          if (num2 < num1) {
            temporary = num1;
            num1 = num2;
            num2 = temporary;
          }
          
          if (num3 < num1) {
            temporary = num1;
            num1 = num3;
            num3 = temporary;
          }
        }
        
        if (num3 < num2) {
          temporary = num2;
          num2 = num3;
          num3 = temporary;
        }
      // This prints out the numbers in increasing order.
      System.out.println(num1 + " " + num2 + " " + num3);
  }
}
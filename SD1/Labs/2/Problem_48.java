/**
  * file: Problem_48.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file has a user input one number and then
  * display's the character that corresponds to the
  * ASCII code. 
  */
import java.util.Scanner;

public class Problem_48 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      // This prompts a user to enter a code integer.
      System.out.print("Enter an ASCII code integer: ");
      int code = input.nextInt();
      // This prints the code as a character from an integer.
      System.out.println((char)code);
  }
}
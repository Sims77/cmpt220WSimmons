/**
  * file: Problem_415.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file has the user end a letter
  * and the system will say what button
  * it is on on an old telephone.
  */
import java.util.Scanner;

public class Problem_415 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      // This prompts a user to enter a letter to find out where
      // it is on a telephone then defines them. 
      System.out.print("Enter a letter for the number on a telephone: ");
      String s = input.nextLine();
      char ch = s.charAt(0);
      ch = Character.toUpperCase(ch);

      int num = 0;
      // This determines what number the letter is on. 
      if (Character.isLetter(ch)) {
        if (ch >= 'W') num = 9;
        else if (ch >= 'T')num = 8;
        else if (ch >= 'P') num = 7; 
        else if (ch >= 'M') num = 6;
        else if (ch >= 'J') num = 5;
        else if (ch >= 'G') num = 4;
        else if (ch >= 'D') num = 3;
        else if (ch >= 'A') num = 2;
        // This prints the letter as a number on the telephone.
        System.out.println("Your letter is " + num + " on the telephone");
      }
      else 
        System.out.println(ch + " is an invalid character.");
  }
}
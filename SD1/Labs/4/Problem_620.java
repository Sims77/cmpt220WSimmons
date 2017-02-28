/**
  * file: Problem_620.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file prompts a user to enter a string and then
  * counts the nnumber or letters in the string and 
  * displays it back to the user.
  */

import java.util.Scanner;

public class Problem_620 {
  public static void main(String[] args) {
    // Creates a new scanner.
    Scanner input = new Scanner(System.in);
      // Prompts the user to enter a string.
      System.out.print("Enter a string: ");
      // Defines the string input by the user.
      String user = input.nextLine();
    // Displays the number of letters in the users string.
    System.out.println("The number of letters in your string is "
      + numberOfLetters(user));
  }
  // Counts each letter in the users string.
  public static int numberOfLetters(String user) {
    int countLetters = 0;
    for(int i = 0; i < user.length(); i++) {
      if(Character.isLetter(user.charAt(i))) {
        countLetters++;
      }
    }
    // Returns the counted letters in the users string.
    return countLetters;
  }
}

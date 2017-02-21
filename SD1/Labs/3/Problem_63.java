/**
  * file: Problem_63.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file will calculate then find if the integer is
  * a palindrome which means that the numers is the same
  * in reverse.
  */

import java.util.Scanner;

public class Problem_63 {
  public static void main(String[] args) {
    //Imports a scanner
    Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      // Defines the next user input
      int n = input.nextInt();
      // Two different outcomes depending if the number is
      // palindrome or not
      if (isPalindrome(n)) {
        System.out.println(n + " is a palindrome.");
      } else {
        System.out.println(n + " is not a palindrome.");
      }
  }
  public static int reverse(int num) {
    // Defines the reverse of a number
    int reverse = 0;
    // While statement to check if the number is palindrome
    while (num != 0) {
      reverse *= 10;
      reverse += num % 10;
      num /= 10;
    }
    // Returns the original reverse
    return reverse;
  }
  public static boolean isPalindrome(int num) {
    // Check to make sure the number is equal to the reverse.
    return (num == reverse(num));
  }
}
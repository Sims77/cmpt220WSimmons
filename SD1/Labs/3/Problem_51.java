/**
  * file: Problem_51.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file asks for integers from the user then will display
  * how many are positive and how many are negative. It will 
  * lastly average the numbers aswell.
  */

import java.util.Scanner;

public class Problem_51 {
  public static void main(String[] args) {
  	// Imports a scanner
  	Scanner input = new Scanner(System.in);
  	  // Defines variables and what the average is equal to
  	  int pos = 0;
  	  int neg = 0;
  	  int count = 0;
  	  double tot = 0;
  	  double avg = tot / count;
  	// Asks for user input with integers
  	System.out.print("Enter integers, input 0 when you want to end it: ");
  	// Defines the user input
  	int num = input.nextInt();
  	// If statement that check to make sure at least one number was entered
  	if (num == 0) {
      System.out.println("No numbers were entered");
      System.exit(1);
  	}
  	// While statement to check which numbers are positive
  	// and which are negative.
  	while (num !=0) {
  	  if (num > 0)
  	  	pos++;
  	  else 
  	  	neg++;
  	    tot += num;
  	    count++;
  	    num = input.nextInt();
  	}
  	// Prints how many positive, negative, total numbers, and the
  	// average of all of the users inputs
    System.out.println(
			"The number of positive is " + pos +
			"\nThe number of negatives is " + neg +
			"\nThe total is " + tot +
			"\nThe average is " + avg);
  }
}
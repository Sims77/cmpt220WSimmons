/**
  * file: Problem_311.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file has the user input a year and month
  * and the java should output how many days are in
  * that month in that year. 
  */
import java.util.Scanner;

public class Problem_311 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      // This prompts the user to enter a month and year.
      System.out.print("Enter a month as an integer: ");
      int month = input.nextInt();
      System.out.print("Enter a year as an integer: ");
      int year = input.nextInt();
      // This defines the different cases for each month and year.
      switch(month){
        case 1: System.out.println("January " + year + " had 31 days!");break;
        case 2: System.out.println("February " + year + " had 29 days!");break;
        case 3: System.out.println("March " + year + " had 31 days!");break;
        case 4: System.out.println("April " + year + " had 30 days!");break;
        case 5: System.out.println("May " + year + " had 31 days!");break;
        case 6: System.out.println("June " + year + " had 30 days!");break;
        case 7: System.out.println("July " + year + " had 31 days!");break;
        case 8: System.out.println("August " + year + " had 31 days!");break;
        case 9: System.out.println("September " + year + " had 30 days!");break;
        case 10: System.out.println("October " + year + " had 31 days!");break;
        case 11: System.out.println("November " + year + " had 30 days!");break;
        case 12: System.out.println("December " + year + " had 31 days!");break;

      }
  }
}
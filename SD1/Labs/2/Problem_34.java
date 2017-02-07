/**
  * file: Problem_34.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file generates a random number,
  * 1-12, then will display the month that
  * corrdinates with that number.
  */

public class Problem_34 {
  public static void main(String[] args) {
    // This will pick a random integer from 1-12.
    int month = (int)((Math.random() * 12) + 1);
    // This will display the month based on the cases.
    switch (month) {
      // These are all of the different cases for each random integer
      // that could be chosen.
      case 1: System.out.println("January");break;
      case 2: System.out.println("February");break;
      case 3: System.out.println("March");break;
      case 4: System.out.println("April");break;
      case 5: System.out.println("May");break;
      case 6: System.out.println("June");break;
      case 7: System.out.println("July");break;
      case 8: System.out.println("August");break;
      case 9: System.out.println("September");break;
      case 10: System.out.println("October");break;
      case 11: System.out.println("November");break;
      case 12: System.out.println("December");
    }
  }
}
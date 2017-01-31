/**
  * file: Problem_26.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 1
  * due date: January 31, 2017
  * version: 1
  *
  * This file outputs the gratuity and total
  * from a subtotal and the gratuity.
  */

public class Exercise_02_06 {
  public static void main(String[] args) {
    // Creates a scanner object.
    Scanner input = new Scanner(System.in);

    // Makes a user enter a number between 0 and 1000.
    System.out.print("Enter a number between 0 and 1000: ");
      // This makes the number to be added together as integers.
      int number = input.nextInt();
      int lessThan = number % 10;
        number /= 10;
      int ten = number % 10;
        number /= 10;
      int hundred = number % 10;
        number /= 10;
      int sum = hundred + ten + lessThan; 

      // This shows results to user.
      System.out.println("The sum of the digits is " + sum);
  }
}
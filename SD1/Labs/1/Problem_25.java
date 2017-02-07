/**
  * file: Problem_25.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 1
  * due date: January 31, 2017
  * version: 1
  *
  * This file outputs the gratuity and total
  * from a subtotal and the gratuity.
  */

public class Problem_25 {
  public static void main(String[] args) {
    // This creates a scanner object.
    Scanner input = new Scanner(System.in);
      System.out.print("Enter subtotal and gratuity rate: ");
        // This are the doubles used in the equation to find the gratuity
        // and the total.
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = gratuity + subtotal;
          // This is the statement used to show the gratuity and total.
          System.out.println("The gratuity is $" + gratuity + "and the total
           is $" + total);
  }
}
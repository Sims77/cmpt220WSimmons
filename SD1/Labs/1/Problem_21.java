/**
  * file: Problem_21.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 1
  * due date: January 31, 2017
  * version: 1
  *
  * This file outputs the fahrenheit
  * from a celsius in the console.
  */

public class Problem_21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Enter a degree in celsius: ");
        // This defines the doubles used to calculate the fahrenheit.
        double celsius = input.nextDouble();
        // This is the formula to covert the celsius.
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
          // This displays the farhenheit after being converted. 
          System.out.println(celsius + "celsius is" + fahrenheit
          + "fahrenheit");

  }
}
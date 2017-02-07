/**
  * file: Problem_426.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file generates a r
  */
import java.util.Scanner;

public class Problem_426 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      // Prompts a user to enter a money amount.
      System.out.print("Enter an amount of money: ");
       
      String amount = input.nextLine();
      String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));
      // This determines each type of coin based on its value. 
      int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
      int numberOfQuarters = cents / 25; 
        cents %= 25;
      int numberOfDimes = cents / 10;
        cents %= 10;
      int numberOfNickels = cents / 5;
        cents %= 5;
      // This prints how much of each coin and dollars their initial amount
      // inputted was. 
      System.out.println("Your amount " + amount + " consists of\n " 
        + numberOfOneDollars + " dollars\n " 
        + numberOfQuarters + " quarters\n "
        + numberOfDimes + " dimes\n "
        + numberOfNickels + " nickels\n "
        + cents + " pennies\n "
        );
  }
}
/**
  * file: Problem_425.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file generates a random
  * vehicle plate number.
  */

public class Problem_425 {
  public static void main(String[] args) {
    // This randomly picks three letter for a license plate.
    int letter1 = 65 + (int)(Math.random() * (90-65));
    int letter2 = 65 + (int)(Math.random() * (90-65));
    int letter3 = 65 + (int)(Math.random() * (90-65));
    // This randomly picks four numbers for a license plate. 
    int num1 = (int)(Math.random() * 10);
    int num2 = (int)(Math.random() * 10);
    int num3 = (int)(Math.random() * 10);
    int num4 = (int)(Math.random() * 10);
    // This prints out the random letters and numbers for a 
    // license plate. 
    System.out.println("" + ((char)(letter1)) + ((char)(letter2)) +
      ((char)(letter3)) + num1 + num2 + num3 + num4);
  }
}
/**
  * file: Problem_1017.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 7
  * due date: April 25, 2017
  * version: 1
  *
  * This file will calculate and find the first 10
  * numbers that are greater than the Long max value.
**/
import java.math.BigInteger;

public class Problem_1017 {
  public static void main(String[] args) {
    // Finds the first 10 square numbers that are
    // largers than Long.MAX_VALUE
    BigInteger i = new BigInteger(Long.MAX_VALUE + ""); 
    BigInteger end = i.add(new BigInteger("10"));

    // Displays the result of numbers
    for (i = new BigInteger(Long.MAX_VALUE + ""); 
      i.compareTo(end) <= 0; 
      i = i.add(new BigInteger("1"))) {
      System.out.println(i.multiply(i)); 
    }   
  }
}
/**
  * file: Problem_57.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file will calculate the cost of tuition at a university
  * that is $10,000 a year and increases 5% a year. The program 
  * will find out the total cost of four years of education
  * in ten years.
  */

public class Problem_57 {
  public static void main(String[] args) {
    // Defines the variables for tuition
    int totcost = 0;
    int tuition = 10000;
    int tuitionten = 0;
    // For statement that increases the year until the 14th
    for (int yr = 1; yr <= 14; yr++) {
      // Increases the tuition cost 5% every year
      tuition += (tuition * .05);
        // Makes the tution cost equal to the original tution after
        // the tenth year
        if (yr > 10)
          totcost += tuition;
        if (yr == 10)
          tuitionten = tuition;
    }
    // Prints the tuition in ten years then the total cost
    // for four years of tution. 
    System.out.println("Tuition in ten years: $" + tuitionten);
    System.out.println("Total cost for four years' worth of tuition" +
      " after the tenth year: $" + totcost);
  }
}
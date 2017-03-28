/**
  * file: Problem_813.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file will ask for input from the user for the number of columns
  * and the number of rows. Then the user will input numbers for each
  * of the spots in the array. It will lastly find the largest number
  * in the array. 
  */
import java.util.Scanner;

public class Problem_813 {
  public static void main(String[] args) {
    // Creates a new scanner
    Scanner input = new Scanner(System.in);
    // Asks for user input for the number of columns and rows
    System.out.println("Enter the number of rows and columns in the array: ");
    // Defines the rows, columns, and the array for them combined
    int row = input.nextInt();
    int col = input.nextInt();
    double[][] m = new double[row][col];

    // Asks for user input for the numbers in the array that they defined
    System.out.println("Enter the array below: ");
    for(int i = 0; i < row; i++)
      for(int k = 0; k < col; k++)
        m[i][k] = input.nextDouble();

    // Creates array for the location of the largest element
    int[] location = locateLargest(m);
    // Displays the largest element in the array
    System.out.printf("The location of the largest element is (%d, %d)\n", 
      location[0], location[1]);
  }
  // Creates a new method for finding the largest element
  public static int[] locateLargest(double[][] a) {
    int[] location = new int[] {0, 0};
    double largest = a[0][0];
    for(int i = 0; i < a.length; i++) {
      for(int k = 0; k < a[i].length; k++) {
        // Identifies the largest in the row and columns
        if(a[i][k] > largest) {
          // Rows
          location[0] = i;
          // Columns
          location[1] = k;
          largest = a[i][k];
        }
      }
    }
    return location;
  }
}
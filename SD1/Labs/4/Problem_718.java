/**
  * file: Problem_718.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file prompts an input from the user for ten numbers.
  * The program then uses the Bubble sort algorithm to sort
  * the array of numbers then displays it back to the user.
  */

import java.util.Scanner;

public class Problem_718 {
  public static void main(String[] args) {
    // Creates a new scanner.
    Scanner input = new Scanner(System.in);
    // Creates a string of 10 for the user input.
    double[] usernum = new double[10];
      // Prompts user to enter 10 numbers.
      System.out.print("Please enter 10 numbers: ");
      // Defines the numbers entered and determines length.
      for(int i = 0; i < usernum.length; i++) {
        usernum[i] = input.nextDouble();
      }
      // Creates method for the bubble sort.
      bubbleSort(usernum);
      // This displays the sorted list of ten numbers.
      System.out.println("The list being sorted is ");
        userList(usernum);
  }
  // Creates the list.
  public static void userList(double[] lists) {
    for(int i = 0; i < lists.length; i++)
      System.out.println(lists[i]);
  }
  // Goes through the numbers and uses the bubble
  // sort algorithm.
  public static void bubbleSort(double[] lists) {
    boolean change = true;
      do {
        change = false;
        for(int i = 0; i < lists.length - 1; i++)
          if(lists[i] > lists[i + 1]) {
            double swap = lists[i];
            lists[i] = lists[i + 1];
            lists[i + 1] = swap;
            change = true;
          }
      } while(change);
  }
}
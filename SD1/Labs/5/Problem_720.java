/**
  * file: Problem_720.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file uses the selection sort method by finding the largest number
  * then switching it with the last number. This is done with ten 
  * double numbers.
  */
import java.util.Scanner;

public class Problem_720 {
  public static void main(String[] args) {
    // Creates a new scanner
    Scanner input = new Scanner(System.in);
    // Creates array of a size of ten
    double[] number = new double[10];
    
    // Asks for input from the user
    System.out.println("Please Enter 10 numbers: ");
      for(int i = 0; i < number.length; i++)
        number[i] = input.nextDouble();
      // Runs methods of selectSort
      selectSort(number);
      
      // Prints selection sort list
      for(double n: number)
        System.out.print(n + " ");
      System.out.println();
  }
  // Creates new method for selection sort
  public static void selectSort(double[] list) {
    for(int i = list.length - 1; i >= 0; i--) {
      double nowMax =  list[1];
      int nowMaxOrder = i;
      
      // Finds the largest number then switches it with the last
      for(int j = i - 1; j >= 0; j--) {
        if(nowMax < list[j]) {
          nowMax = list[j];
          nowMaxOrder = j;
        }
      }
      if(nowMaxOrder != i) {
        list[nowMaxOrder] = list[i];
        list[i] = nowMax;
      }

    }
  }
}
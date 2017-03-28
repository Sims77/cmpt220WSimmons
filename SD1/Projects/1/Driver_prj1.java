/**
  * file: Driver_prj.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: Project 1
  * due date: March 28, 2017
  * version: 1
  *
  * This file takes two different arrays and then uses
  * convolution on them. 
  */

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    // Creates a new scanner
    Scanner input = new Scanner(System.in);
    // Defines the first and second vector lengths
    int vectFirstLen = input.nextInt();
    int vectSecLen = input.nextInt();
    
    // Defines the array for the first vector based on its length
    double[] vectFirst = new double[vectFirstLen];
    for(int i = 0; i < vectFirst.length; i++)
      vectFirst[i] = input.nextDouble();
    // Defines the array for the second vector based on its length
    double[] vectSec = new double[vectSecLen];
    for(int i = 0; i < vectSec.length; i++)
      vectSec[i] = input.nextDouble();

    // Defines the combined array for the first and second array and calls
    // the methods for the convolution of the vectors
    double[] combine = convolveVectors(vectFirst, vectSec);
    
    // Defines the array for the comvolution based on the combined vectors
    int[] convolution = new int[combine.length];
    for(int i = 0; i < combine.length; i++)
      convolution[i] = (int)Math.round(combine[i]);
    
    // Prints the convolutions
    for(int e: convolution) {
      System.out.print(e + " ");
    }
    System.out.println();
    
  }
  
  // Creates a new method for the convolution of the vectors
  public static double[] convolveVectors(double[] vectFirst,
    double[] vectSec) {
    // Defines the new array for the result of convolution
    double[] vResult = new double[(vectFirst.length + vectSec.length) - 1];
    
    // For loop that will flip the second vector
    for(int i = 0; i < vResult.length / 2; i++) {
      double change = vResult[i];
      vResult[i] = vResult[vResult.length - i - 1];
      vResult[vResult.length - i - 1] = change;
    }
    // Executes the convolution function
    for(int idx = 0; idx < vResult.length; idx++) {
      vResult[idx] = 0;
      for(int shift = 0; shift <= idx; shift++) {
      	if((idx - shift >= 0) && (shift <= idx) && 
      	  (idx - shift < vectFirst.length) && (shift < vectSec.length))
      	  vResult[idx] += vectFirst[idx - shift] * vectSec[shift];
      }
    }

    // Returns result
    return vResult;  
  }

}
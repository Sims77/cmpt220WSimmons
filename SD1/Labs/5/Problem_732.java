/**
  * file: Problem_732.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file asks for an input from a user for a list of numbers.
  * The file will then display the new list after the partition.
  */
import java.util.Scanner;

public class Problem_732 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    // User input for the list
    System.out.print("Enter a list: ");
    // The array for the list
    int size = input.nextInt();
    int[] list = new int[size];
    // Analyze the list    
    for (int i = 0; i < list.length; i++) 
      list[i] = input.nextInt();
    
    // Runs the method that partitions the list
    partition(list);

    // Prints out the partition list
    System.out.print("After the partition, the list is ");
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }

  // Partition the array list
  public static int partition(int[] list) {
  	int first = 0;
  	int last = list.length - 1;
    // Choose the first element as the pivot
    int pivot = list[first];
    // Index for forward search
    int low = first + 1;
     // Index for backward search
    int high = last;

    while (high > low) {
      // Search forward from left
      while (low <= high && list[low] <= pivot)
        low++;

      // Search backward from right
      while (low <= high && list[high] > pivot)
        high--;

      // Swap two elements in the list
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }

    while (high > first && list[high] >= pivot)
      high--;

    // Swap pivot with list
    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    }
    else {
      return first;
    }
  }
}

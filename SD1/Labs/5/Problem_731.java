/**
  * file: Problem_731.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file will display one list. It will take two different sorted
  * lists then merges them together to make one list.
  */
import java.util.Scanner;

public class Problem_731 {
  public static void main(String[] args) {
    // Creates a new scanner
    Scanner input = new Scanner(System.in);

    // Asks for user input for list 1 then defines it
    System.out.println("Enter list 1: ");
    int[] list1 = new int[input.nextInt()];
    for(int i = 0; i < list1.length; i++) {
      list1[i] = input.nextInt();
    }
    // Askes for user input for list 2 then defines it
    System.out.print("Enter list 2: ");
    int[] list2 = new int[input.nextInt()];
    for(int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();
    }
    // Merges list 1 and 2
    int[] list3 = merge(list1, list2);
    
    // Displays the merges list between 1 and 2
    System.out.print("The merged list between 1 and 2 is ");
    for(int x: list3) {
      System.out.print("" + x);
    }
    System.out.println();
  }
  // Creates a new method for the merge
  public static int[] merge(int[] list1, int[] list2) {
    int[] list3 = new int[list1.length + list2.length];
    
    // Merges the two new lists into list 3
    for(int i = 0; i < list1.length; i++)
      list3[i] = list1[i];
    for(int i = 0, j = list1.length; i < list2.length; i++, j++) {
      list3[j] = list2[i];
    }
    // Calls method sort
    sort(list3);
    
    // Returns the new list 3
    return list3;
  }
  // Creates a new method for the sorting of the list
  public static void sort(int[] list) {
    // Defines new list order and puts the new list in accending order
    for(int i = 0; i < list.length - 1; i++) {
      int min = list[i];
      int minOrder = i;
      
      for(int j = i + 1; j < list.length; j++) {
        if(list[j] < min) {
          min = list[j];
          minOrder = j;
        }
      }
      if(minOrder != i) {
        list[minOrder] = list[i];
        list[i] = min;
      }
    }
  }
}
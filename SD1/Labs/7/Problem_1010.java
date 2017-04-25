/**
  * file: Problem_1010.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 7
  * due date: April 25, 2017
  * version: 1
  *
  * This file will take numbers from 1 to 20
  * and put them into a queue.
**/

public class Problem_1010 {
  public static void main(String[] args) {
    // Creates a queue object
    Queue queue = new Queue();
    
    // Puts numbers 1 to 20 into the queue
    for (int i = 1; i <= 20; i++) {
      queue.enqueue(i);
    }
    // Removes the numbers from the queue and displays them
    while (!queue.empty()) {
      System.out.print(queue.dequeue() + " ");
    }
    System.out.println();
  }
  // Creates the queue class
  public static class Queue {
    // Creates the data fields
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    // Default contructor
    Queue() {
      elements = new int[DEFAULT_CAPACITY];
    }
    //Puts v into the queue
    public void enqueue(int v) {
      if (size >= elements.length) {
        int[] temp = new int[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
      }
      elements[size++] = v;
    }
    // Removes and then returns the elements from the queue
    public int dequeue() {
      int v = elements[0];
      int[] temp = new int[elements.length];
      System.arraycopy(elements, 1, temp, 0, size);
      elements = temp;
      size--;
      return v;
    }
    // Returns true when the queue is empty
    public boolean empty() {
      return size == 0;
    }
    // Returns the size
    public int getSize() {
      return size;
    }
  }
}

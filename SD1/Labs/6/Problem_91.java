/**
  * file: Problem_91.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 6
  * due date: April 18, 2017
  * version: 1
  *
  * This file will take the height and length of two
  * different rectangles that were set from the book,
  * then will calulate the area and perimeter.
  */

public class Problem_91 {
  public static void main(String[] args) {
    // Defines the two rectangles based on data from book
    Rectangle rec1 = new Rectangle(4, 40);
    Rectangle rec2 = new Rectangle(3.5, 35.9);
    
    // Displays the stats for the first rectangle
    System.out.println("Rectangle 1");
    System.out.println("Width: " + rec1.width);
    System.out.println("Height: " + rec1.height);
    System.out.println("Area: " + rec1.getArea());
    System.out.println("Perimeter: " + rec1.getPerimeter());
    
    // Displays the stats for the second rectangle
    System.out.println("Rectangle 2");
    System.out.println("Width: " + rec2.width);
    System.out.println("Height: " + rec2.height);
    System.out.println("Area: " + rec2.getArea());
    System.out.println("Perimeter: " + rec2.getPerimeter());
  }
  // Creates the rectangle class
  public static class Rectangle {
    // Creates doubles for the width and height of rectangle
    double width;
    double height;
    
    // Defines a contructor for a default rectangle
    Rectangle() {
      width = 1;
      height = 1;
    }
    // Creates a contructor for a rectangle with specific widths and heights
    Rectangle(double newWidth, double newHeight) {
      width = newWidth;
      height = newHeight;
    }
    // Finds and returns the area of a rectangle
    double getArea() {
      return width * height;
    }
    // Finds and returns the perimeter of a rectangle
    double getPerimeter() {
      return 2 * (width + height);
    }
  }
}


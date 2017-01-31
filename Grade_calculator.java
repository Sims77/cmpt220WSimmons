/**
  * file: Grade_calculator.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 1
  * due date: January 31, 2017
  * version: 1
  *
  * This file inputs the scores of a student
  * then outputs his final grades based on their
  * scores and the percentage for each category.
  */

public class Grade_calculator {
  public static void main(String[] args) {
    // Creates a new scanner.
    Scanner input = new Scanner(System.in);
    // This gives a place to enter a midterm grade and saves the number.
    System.out.print("Enter midterm grade: ");
    double midterm = input.nextDouble();
    // This gives a place to enter a final exam grade and saves the number.
    System.out.print("Enter final exam grade: ");
    double finalExam = input.nextDouble();
    // This gives a place to enter the projects grade and saves the number.
    System.out.print("Enter projects grade: ");
    double projects = input.nextDouble();
    // This gives a place to enter a homework and labs
    // grade and saves the number.
    System.out.print("Enter home and labs grade: ");
    double homeworkAndLabs = input.nextDouble();
    // This expression calculates the final grade using the average. 
    double grade = midterm + finalExam + projects + homeworkAndLabs / 4;
    System.out.println("The students final grade is: " + grade "%");
  }
}
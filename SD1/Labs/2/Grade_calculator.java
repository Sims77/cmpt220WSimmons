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
import java.util.Scanner;

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
    // This determines what letter grade they got.
    if (grade <= 100 && grade >= 95) {
        System.out.println("You got an A");
    } if (grade <= 94 && grade >= 90) {
        System.out.println("You got an A-");
    } if (grade <= 89 && grade >= 87) {
        System.out.println("You got a B+");
    } if (grade <= 86 && grade >= 83) {
        System.out.println("You got a B");
    } if (grade <= 82 && grade >= 80){
        System.out.println("You got a B-");
    } if (grade <= 79 && grade >= 77) {
        System.out.println("You got a C+");
    } if (grade <= 76 && grade >= 73) {
        System.out.println("You got a C");
    } if (grade <= 72 && grade >= 70) {
        System.out.println("You got a C-");
    } if (grade <= 69 && grade >= 65) {
        System.out.println("You got a D+");
    } if (grade <= 64 && grade >= 60) {
        System.out.println("You got a D");
    } if (grade <= 59) {
        System.out.println("You got a F");
    }
  }
}
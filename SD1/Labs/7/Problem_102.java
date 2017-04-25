/**
  * file: Problem_102.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 7
  * due date: April 25, 2017
  * version: 1
  *
  * This file calculates the BMI for a specific individual that
  * are provided from the book.
**/

public class Problem_102 {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
      System.out.println("The BMI for " + bmi1.getName() + " is "
        + bmi1.getBMI() + " " + bmi1.getStatus());

    BMI bmi2 = new BMI("Susan King", 215, 70);
      System.out.println("The BMI for " + bmi2.getName() + " is "
        + bmi2.getBMI() + " " + bmi2.getStatus());
  }
  
  private String name;
  private int age;
  private double weight;
  private double height;
  public static final double kg_per_pound = 0.4535;
  public static final double m_per_inch = 0.0254;
  public static final double inch_per_ft = 12;

  public BMI(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  public BMI(String name, int age, double feet, double inches) {
    this(name, age, weight, inches + feet * 12);
  }

  public double getBMI() {
    double bmi = weight * kg_per_pound / ((height * m_per_inch) * 
      (height * m_per_inch));
    return Math.random(bmi * 100) / 100.0;
  }

  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25) 
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }
}

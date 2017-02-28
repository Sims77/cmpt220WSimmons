/**
  * file: Problem_68.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file displays temperatures in celsius and fahrenheit
  * and displays them converted to the other measurement of
  * temperature in a table via single-dimensional arrays.
  */

public class Problem_68 {
  public static void main(String[] args) {
    // This is the display header for the array.
    System.out.println(
      "Celsius       Fahrenheit    |     Fahrenheit     Celsius\n"
      + "---------------------------------------------------------");
    // These doubles define the original celsius and fahrenheit temperatures.
    double celsius = 40;
    double fahrenheit = 120;
    // This for sets the range for the celsius and fahrenheit and then
    // displays it based on the header.
    for(int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
      System.out.println(celsius + "\t\t" + celsiusToFahrenheit(celsius)
        + "\t\t" + fahrenheit + "\t\t" + fahrenheitToCelsius(fahrenheit));
    }
  }
  // Converts celsius to fahrenheit.
  public static double celsiusToFahrenheit(double celsius) {
    return(9.0 / 5.0) * celsius + 32;
  }
  // Converts fahrenheit to celsius.
  public static double fahrenheitToCelsius(double fahrenheit) {
    return(5.0 / 9.0) * (fahrenheit - 32);
  }
}
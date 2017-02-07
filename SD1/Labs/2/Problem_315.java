/**
  * file: Problem_315.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file has the user to enter a three digit
  * integer and then uses a lottery system and determines
  * how much money they have won depending on how many
  * of their number's match the lottery ones.
  */
import java.util.Scanner;

public class Problem_315 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // This defines the random numbers for the lotto. 
    int lotto = (int) (Math.random() * 1000);
    
    System.out.print("Enter your lottery numbers in integers: ");
    int user = input.nextInt();
    // This sorts each lotto number.
    int lottonum1 = lotto / 100;
    int lottonum2 = lotto % 100 / 10;
    int lottonum3 = lotto % 10;
    // This sorts the users lotto numbers. 
    int usernum1 = lotto / 100;
    int usernum2 = lotto % 100 / 10;
    int usernum3 = lotto % 10;

    System.out.println("The winning numbers are: " + lotto);
    // This statement determines what the user has one based on
    // the number of correct digits in correct places.
    if (user == lotto) {
      System.out.println("Correct Numbers and Placement: You win $10,000");
    } else if (((usernum2 == lottonum1) && (usernum1 == lottonum2)
            && (usernum3 == lottonum3)) || ((usernum1 == lottonum1)
            && (usernum3 == lottonum2) && (usernum2 == lottonum3)) ||
            ((usernum3 == lottonum1) && (usernum1 == lottonum2)
            && (usernum2 == lottonum3)) || ((usernum2 == lottonum1)
            && (usernum3 == lottonum2) && (usernum1 == lottonum3)) ||
            ((usernum3 == lottonum1) && (usernum2 == lottonum2)
            && (usernum1 == lottonum3))) {
      System.out.println("Correct Numbers but not placement:
        You win $3,000");
    } else if ((guessDigit1 == lotteryDigit1) ||
            (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3)
            || (guessDigit2 == lotteryDigit1) ||
            (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3)
            || (guessDigit3 == lotteryDigit1) ||
            (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3)) {
      System.out.println("Only One Correct Digit: You win $1,000");
    } else {
      System.out.println("No Correct Digits: You lose :(");
    }
  }
}
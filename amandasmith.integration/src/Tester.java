// Amanda Smith
// The integration project is a compilation of things I've learned.
// The project is directed toward creating an application.

import java.util.*;

public class Tester {

  public static void doTester() {
    Scanner userInput = new Scanner(System.in);

    // Unit price finder
    double price;
    double quantity;

    System.out.println("Find the unit price!");
    System.out.println("Enter price: ");
    price = userInput.nextDouble();

    System.out.print("Enter quantity: ");
    quantity = userInput.nextDouble();

    double unitPrice = price / quantity;

    System.out.println("The unit price is: $" + unitPrice);

    // Using the remainder operation to determine whether the number is even or odd.
    int x;

    System.out.println("See if your number will be even or odd!");
    System.out.println("Enter your number: ");
    x = userInput.nextInt();


    int roundedNum = x % 2;

    if (roundedNum == 0) {
      System.out.println("Your number is even.");
    } else {
      System.out.println("Your number is odd.");
    }

    // Magic birthday guesser

    double birthMonth;

    System.out.println("Can we show your birthday?");
    System.out.println("We start with the number 7. Feel free to follow along with a calculator.");
    System.out.println("Enter the number associated with your birth month: ");
    birthMonth = userInput.nextDouble();

    double stepOne = 7 * birthMonth;

    System.out.println("7 x" + birthMonth + " = " + stepOne);
    System.out.println("We're going to multiply the 7 and your birth month.");
    System.out.println("Next we'll subtract 1.");

    double stepTwo = stepOne - 1;

    System.out.println(stepOne + "- 1 = " + stepTwo);
    System.out.println("Now we'll multiply that number by 13");

    double stepThree = stepTwo * 13;
    double birthDay;

    System.out.println("13 x " + stepTwo + " = " + stepThree);
    System.out.println("Enter your birth day: ");
    birthDay = userInput.nextDouble();

    System.out.println("We'll add your birth day to " + stepThree);

    double stepFour = stepThree + birthDay;

    System.out.println(stepThree + " + " + birthDay + " = " + stepFour);
    System.out.println("Now, add 3");

    double stepFive = 3 + stepFour;

    System.out.println("3 + " + stepFour + " = " + stepFive);
    System.out.println("Multiply by 11");

    double stepSix = 11 * stepFive;

    System.out.println(stepFive + " x 11 = " + stepSix);

    System.out.println("Subtract your birth month");

    double stepSeven = stepSix - birthMonth;

    System.out.println(stepSix + " - " + birthMonth + " = " + stepSeven);
    System.out.println("Subtract your birth day");

    double stepEight = stepSeven - birthDay;

    System.out.println(stepSeven + " - " + birthDay + " = " + stepEight);
    System.out.println("Divide that number by 10");

    double stepNine = stepEight / 10;

    System.out.println(stepEight + " / 10 = " + stepNine);
    System.out.println("Add 11 to that number");

    double stepTen = stepNine + 11;

    System.out.println(stepNine + " + 11 = " + stepTen);
    System.out.println("Finally, divide by 100");

    double stepEleven = stepTen / 100;

    System.out.println(stepTen + " / 100 = " + stepEleven);
    System.out.println("Is " + stepEleven + " your birthday in decimal form?");



  }

}

// Amanda Smith
// The integration project is a compilation of things I've learned.
// The project is directed toward creating an application.
// This class is for a Sign-up screen.

import java.util.*;

public class Signup {

  public static void doSignup() {
    Scanner userInput = new Scanner(System.in);

    String firstName;
    String lastName;
    String birthdayMonth;
    String birthdayDay;
    String birthdayYear;
    String email;
    String reenterEmail;
    String newPassword;
    String reenterNewPassword;

    System.out.println("Sign Up for an Account");
    System.out.println("First Name: ");
    firstName = userInput.next();

    System.out.println("Last Name: ");
    lastName = userInput.next();

    System.out.println("Birthday: ");
    System.out.println("Month: ");
    birthdayMonth = userInput.next();

    if ((birthdayMonth.length() == 2)) {
    } else {
      System.out.println("Invalid Month.");
    }

    System.out.println("Day: ");
    birthdayDay = userInput.next();

    if ((birthdayDay.length() == 2)) {
    } else {
      System.out.println("Invalid Day.");
    }

    System.out.println("Year: ");
    birthdayYear = userInput.next();

    if ((birthdayYear.length() == 4)) {
    } else {
      System.out.println("Invalid Year.");
    }

    System.out.println("Email: ");
    email = userInput.next();

    System.out.println("Re-enter Email: ");
    reenterEmail = userInput.next();

    if (email.equals(reenterEmail)) {
    } else {
      System.out.println("Email's do not match.");
    }

    System.out.println("Create Password: ");
    newPassword = userInput.next();

    System.out.println("Re-enter Password: ");
    reenterNewPassword = userInput.next();

    if (newPassword.equals(reenterNewPassword)) {
    } else {
      System.out.println("Password's do not match.");
    }
  }

}

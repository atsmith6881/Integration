// Amanda Smith
// The integration project is a compilation of things I've learned.
// The project is directed toward creating an application.
// This class is for a Login Screen.

// Data Types:
// byte: 8 bit integer with a value between [-128, 127]
// short: 16 bit integer with a value between [-32768, 32767]
// int: 32 bit integer with a value between [-2^31, 2^(31)-1]
// long: 64 bit integer with a value between [-2^63, 2^(63)-1]
// float: single-precision 32 bit IEEE 754 floating point, use a float instead of a byte or short to
// save
// memory in large arrays, should never use for precise values
// double: double precision 64 bit IEEE 754 floating point, better for decimal values, never use for
// precise
// values
// char: single 16 bit Unicode character, min value- '\u0000' (or 0) and max value- '\uffff' (or
// 65535)
// boolean: true or false value, just a conditional answer, not really measured in size
// variable: a value assigned that can change based on the conditions given to it

import java.util.*;

public class Login {

  public static void doLogin() {
    Scanner userInput = new Scanner(System.in);

    String username;
    String password;

    System.out.println("Login");
    System.out.println("Username: ");
    username = userInput.next();

    System.out.println("Password: ");
    password = userInput.next();

    if (username.equals(username) && password.equals(password)) {
      System.out.println("Login Successful!");
    } else {
      System.out.println("Username and/or Password did not match. Please try again.");
    }
  }
}

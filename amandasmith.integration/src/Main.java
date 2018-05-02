// Amanda Smith
// The integration project is a compilation of things I've learned.
// The project is directed toward creating an application.

import java.util.EmptyStackException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Login login = new Login();
    login.doLogin();

    Signup signup = new Signup();
    signup.doSignup();

    Tester tester = new Tester();
    tester.doTester();



    Person mom = new Person();
    mom.setAge(50);
    mom.setHeight(5.9);
    mom.setGender('F');

    Athlete per1 = new Athlete();
    per1.setAge(19);
    per1.setHeight(5.75);
    per1.setGender('F');
    per1.setEndurance(92);

    Person[] people = new Person[2];

    people[0] = mom;
    people[1] = per1;

    for (int i = 0; i < people.length; i++) {
      people[i].printInfo();
    }
    String str = "Amanda/Smith";
    String[] arrOfStr = str.split("/");

    for (String a : arrOfStr)
      System.out.println(a);

    String stri = "MAKE THIS ALL LOWERCASE";
    System.out.println(stri.toLowerCase());

    String strin = "make this all upper case";
    System.out.println(strin.toUpperCase());

    int count = 1;
    do {
      System.out.println("Count is: " + count);
      count++;
    } while (count < 10);

    LocalTime time = LocalTime.now();
    System.out.println("The current time is: " + time);

    LocalDate date = LocalDate.now();
    System.out.println("The current date is: " + date);

    Object b = "This is a sentence.";
    String bb = (String) b;



    Object Object;
    pop();
    {
      Object obj;

      int size = 0;
      if (size == 0) {
        throw new EmptyStackException();
      }

      obj = objectAt(size - 1);
      setObjectAt(size - 1, null);
      size--;
      return;
    }
  }

  // Static means that it belongs to the class, not the object.
  private static void pop() {

  }

  private static void setObjectAt(int i, Object object) {

  }

  private static Object objectAt(int i) {
    return null;
  }

}


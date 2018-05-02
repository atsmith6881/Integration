// Amanda Smith
// The integration project is a compilation of things I've learned.
// The project is directed toward creating an application.

public class Person {

  private int age;
  private double height;

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  private char gender;

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  // call and argument below: "getAge" as the method name, empty argument because it
  // just gets the age from what it was set at. Its calling whatever the age is set at.
  public int getAge() {
    return age;
  }

  // header and parameter below: "int ag" as the parameter used to declare the age.
  public void setAge(int ag) {
    age = ag;
  }

  public void printInfo() {
    System.out.println("I am " + age + " years old," + height + " feet tall, and a " + gender);
  }

}

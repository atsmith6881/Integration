// Amanda Smith
// The integration project is a compilation of things I've learned.
// The project is directed toward creating an application.

// The Athlete class overrides the Person class and hides the method endurance.
// The Athlete class inherits all of the fields and methods from the Person class.
// The Athlete class uses polymorphism because it adds the field endurance which the Person
// class does not have as a basic feature.
public class Athlete extends Person {

  private int endurance;

  public int getEndurance() {
    return endurance;
  }

  public void setEndurance(int endure) {
    endurance = endure;
  }

  public void printInfo() {
    super.printInfo();
    System.out.println("My endurance is " + endurance);
  }
}

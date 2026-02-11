public class Animal extends Organism {

  String name;

  Animal(String name) {
    this.name = name;
  }

  void move() {
    System.out.println("The animal is moving");
  }

  void eat() {
    System.out.println("The animal is eating");
  }

  void printName() {
    System.out.println("This animal name is: " + this.name);
  }

}

public class Person {
  String name;

  Person(String name) {
    this.name = name;
  }

  void greetings() {
    System.out.println("Hello, I'm " + this.name);
  }

}

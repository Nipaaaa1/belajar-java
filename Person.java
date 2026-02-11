public class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void greetings() {
    System.out.printf("Hello, my name is %s, I'm %d years old\n", this.name, this.age);
  }
}

public class Main {

  public static void main(String[] args) {
    // 37 - anonymous class

    Person person1 = new Person("Udin");
    Person person2 = new Person("Jamal") {
      @Override
      void greetings() {
        System.out.println("Hi, I'm " + this.name);
      }
    };

    person1.greetings();
    person2.greetings();
  }
}

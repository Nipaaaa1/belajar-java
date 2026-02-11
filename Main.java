public class Main {

  public static void main(String[] args) {
    // 29 - Abstract class and interface

    Circle circle = new Circle(5);
    Rabbit rabbit = new Rabbit();

    System.out.println("Circle area: " + circle.area());
    rabbit.flee();
  }
}

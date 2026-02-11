import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 30 - Polymorphism
    Scanner scanner = new Scanner(System.in);

    // Static polymorphism
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(5, 10);

    System.out.println("Circle area: " + circle.area());
    System.out.println("Circle rectangle: " + rectangle.area());

    // Runtime / dynamic polymorphism
    Shape shape;
    System.out.print("Enter shape (1 for circle, 2 for rectangle): ");
    int choices = scanner.nextInt();

    if (choices == 1) {
      System.out.print("Enter the radius: ");
      double radius = scanner.nextDouble();

      shape = new Circle(radius);

      System.out.println("The circle area is: " + shape.area());

    } else if (choices == 2) {
      System.out.print("Enter the width: ");
      double width = scanner.nextDouble();

      System.out.print("Enter the length: ");
      double length = scanner.nextDouble();

      shape = new Rectangle(width, length);

      System.out.println("The rectangle area is: " + shape.area());
    } else {
      System.out.println("Choose the right number");
    }

    scanner.close();
  }
}

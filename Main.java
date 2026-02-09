import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Rectangle area calculator

    System.out.print("Enter the rectangle width: ");
    double width = scanner.nextDouble();

    System.out.print("Enter the rectangle width: ");
    double height = scanner.nextDouble();

    double area = width * height;

    System.out.println("The area is: " + area);

    scanner.close();

  }
}

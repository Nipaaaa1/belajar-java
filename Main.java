import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Calculate using Math lib
    System.out.print("Enter the Radius: ");
    double radius = scanner.nextDouble();

    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius, 2);
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    System.out.printf("The circumference is: %.2fcm\n", circumference);
    System.out.printf("The area is: %.2fcm²\n", area);
    System.out.printf("The volume is: %.2fcm³\n", volume);

    scanner.close();
  }
}

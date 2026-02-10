import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Weight conversion program

    System.out.println("Weight conversion program");
    System.out.println("1: convert pounds to kilograms");
    System.out.println("2: convert kilograms to pounds");
    System.out.print("Choose menu (1 or 2): ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      System.out.print("Enter the weight it pounds: ");
      double weight = scanner.nextDouble();
      double newWeight = weight * 0.453592;
      System.out.printf("The weight in kilograms is: %.2f\n", newWeight);
    } else if (choice == 2) {
      System.out.print("Enter the weight it kilograms: ");
      double weight = scanner.nextDouble();
      double newWeight = weight * 2.20462;
      System.out.printf("The weight in pounds is: %.2f\n", newWeight);
    } else {
      System.out.println("Please choose the correct number.");
    }

    scanner.close();
  }
}

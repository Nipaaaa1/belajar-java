import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Compound interest calculator

    System.out.print("Enter the principal amount: ");
    double principal = scanner.nextDouble();

    System.out.print("Enter the interest rate (in %): ");
    double interestRate = scanner.nextDouble() / 100;

    System.out.print("Enter the # of times compounded a year: ");
    int timeCompound = scanner.nextInt();

    System.out.print("Enter the # of years: ");
    int years = scanner.nextInt();

    double total = principal * Math.pow(1 + interestRate / timeCompound, timeCompound * years);

    System.out.printf("You have $%.2f\n", total);

    scanner.close();
  }
}

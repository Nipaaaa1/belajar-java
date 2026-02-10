import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Temperature converter

    System.out.print("Enter your temperature: ");
    double temp = scanner.nextDouble();
    System.out.print("Convert to celcius or fahrenheit (C or F): ");
    String choice = scanner.next().toUpperCase();

    double newTemp = (choice.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

    System.out.printf("Your temperature is %.2f%s\n", newTemp, choice);

    scanner.close();
  }
}

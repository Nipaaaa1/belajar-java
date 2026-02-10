import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 12 - Simple calculator

    System.out.print("Enter the first number: ");
    double firstNumber = scanner.nextDouble();

    System.out.print("Choose your operations (+,-,*,/,^): ");
    String operation = scanner.next();

    System.out.print("Enter the second number: ");
    double secondNumber = scanner.nextDouble();

    switch (operation) {
      case "+" -> {
        double result = firstNumber + secondNumber;

        System.out.println("The result is: " + result);
      }
      case "-" -> {
        double result = firstNumber - secondNumber;

        System.out.println("The result is: " + result);
      }
      case "*" -> {
        double result = firstNumber * secondNumber;
        System.out.println("The result is: " + result);
      }
      case "/" -> {
        if (secondNumber == 0) {
          System.out.println("Can't divide by zero");
        }
        double result = firstNumber / secondNumber;
        System.out.println("The result is: " + result);
      }
      case "^" -> {
        double result = Math.pow(firstNumber, secondNumber);
        System.out.println("The result is: " + result);
      }

      default -> System.out.println("Please choose the right operations");

    }

    scanner.close();
  }
}

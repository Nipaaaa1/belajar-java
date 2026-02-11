import java.util.Scanner;

public class Main {

  static double balance = 0.0;

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // 18 - Bank mini project
    String choices = "";

    do {
      System.out.println("Welcome to your bank");
      System.out.println("Actions: ");
      System.out.println("A. Check balance");
      System.out.println("B. Withdraw money");
      System.out.println("C. Deposit money");
      System.out.println("Q. Quit");
      System.out.print("Choose your action: ");
      choices = scanner.next().toUpperCase();

      switch (choices) {
        case "A" -> checkBalance();
        case "B" -> withdrawMoney();
        case "C" -> depositMoney();
        case "Q" -> System.out.println("Thank you!");
        default -> System.out.println("Please enter a valid choices");
      }

    } while (!choices.equals("Q"));

    scanner.close();
  }

  static void checkBalance() {
    System.out.printf("Your current balance is: $%.2f\n\n", balance);
  }

  static void withdrawMoney() {
    if (balance == 0.0) {
      System.out.println("You can't withdraw, your balance is $0\n");
    } else {
      System.out.print("Enter the amount to withdraw: ");
      double withdrawAmount = scanner.nextDouble();

      if (withdrawAmount > balance) {
        System.out.printf("You can't withdraw $%.2f you only have $%.2f\n\n", withdrawAmount, balance);
      } else {
        balance -= withdrawAmount;
        System.out.printf("You've withdrew $%.2f, your balance now is $%.2f\n\n", withdrawAmount, balance);
      }
    }

  }

  static void depositMoney() {
    System.out.print("Enter the amount to deposit: ");
    double depositAmount = scanner.nextDouble();

    if (depositAmount < 0) {
      System.out.println("You can't deposit a negative numbe\n\n");
    } else {
      balance += depositAmount;
      System.out.printf("You've deposited $%.2f, your balance now is $%.2f\n\n", depositAmount, balance);
    }
  }

}

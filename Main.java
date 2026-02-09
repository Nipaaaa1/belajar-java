import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Shopping Cart Mini Projech

    System.out.print("What item would you like to buy: ");
    String item = scanner.nextLine();

    System.out.print("What is the price for each: ");
    double price = scanner.nextDouble();

    System.out.print("How many would you buy: ");
    double amount = scanner.nextInt();

    System.out.println("You have bought " + amount + " " + item + "/s");

    System.out.println("Your total is: $" + price * amount);

    scanner.close();
  }
}

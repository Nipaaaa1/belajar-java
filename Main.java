import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 11 - Enhanced switch

    System.out.print("Enter your day: ");
    String day = scanner.nextLine();

    switch (day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
        System.out.println("It's weekday😭");
      case "Saturday", "Sunday" ->
        System.out.println("It's a weekend😁");
      default -> System.out.println(day + " is not a day");
    }

    scanner.close();
  }
}

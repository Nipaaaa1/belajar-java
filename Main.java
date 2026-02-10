import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 13 - do / while loop

    String choice = "";

    while (!choice.equals("Q")) {
      System.out.println("You are playing a game");
      System.out.print("Enter Q to exit: ");
      choice = scanner.next().toUpperCase();
    }

    choice = "";

    do {
      System.out.println("You are playing another game");
      System.out.print("Enter Q to exit: ");
      choice = scanner.next().toUpperCase();
    } while (!choice.equals("Q"));

    scanner.close();
  }
}

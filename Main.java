import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 14 - Methods

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    if (checkAge(age)) {
      System.out.println("You're allowed to sign up");
    } else {
      System.out.println("You're not allowed");
    }

    scanner.close();
  }

  static boolean checkAge(int age) {
    return age >= 18;
  }
}

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 20 - Arrays assignment

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter # of fruits: ");
    int size = scanner.nextInt();
    scanner.nextLine(); // Clear buffer from newline

    String[] fruits = new String[size];

    for (int i = 0; i < fruits.length; i++) {
      System.out.print("Enter the fruit name: ");
      fruits[i] = scanner.nextLine();
    }

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    scanner.close();

  }
}

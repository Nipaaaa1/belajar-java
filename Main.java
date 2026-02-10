import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);

    // 14 - for loop

    System.out.print("Choose a number to countdown: ");
    int count = scanner.nextInt();

    for (int i = count; i > 0; i--) {
      System.out.println(i);
      Thread.sleep(1000);
    }

    System.out.println("HAPPY NEW YEAR!");

    scanner.close();
  }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
  static int balance = 100;

  public static void main(String[] args) {
    // 23 - Simple slot machine
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to simple slot!");
    do {
      System.out.println("Current balance: $" + balance);
      System.out.print("Place your bet: ");
      int bet = scanner.nextInt();
      scanner.nextLine();

      if (bet > balance) {
        System.out.println("You can't bet higher than your balance");
        continue;
      } else if (bet < 0) {
        System.out.println("You can't bet negative number");
        continue;
      } else {
        balance -= bet;
      }

      int[] row = generateRow();

      printRow(row);

      int payout = calculatePayout(row, bet);

      if (payout == 0) {
        System.out.println("You Lose😭");
      } else {
        balance += payout;
        System.out.printf("You win $%d🎉\n", payout);
      }

      System.out.print("Play again? (y/n)");
      char choices = scanner.next().charAt(0);

      if (choices == 'n') {
        break;
      }
    } while (balance > 0);

    System.out.println("Thank you for playing! your final balance is: $" + balance);

    scanner.close();
  }

  static int[] generateRow() {
    Random random = new Random();
    int[] row = new int[3];
    for (int i = 0; i < row.length; i++) {
      row[i] = random.nextInt(4);
    }

    return row;
  }

  static void printRow(int[] row) {
    String[] icons = { "🍒", "🍌", "🍉", "🍅" };

    System.out.println("***************");
    for (int item : row) {
      System.out.print(icons[item] + " ");
    }
    System.out.println();
    System.out.println("***************");
  }

  static int calculatePayout(int[] row, int bet) {
    int payout = 0;

    // Check if all item in row matched
    if (row[0] == row[1] && row[1] == row[2]) {
      switch (row[0]) {
        case 0 -> payout = bet * 3;
        case 1 -> payout = bet * 4;
        case 2 -> payout = bet * 5;
        case 3 -> payout = bet * 10;
      }
      return payout;
    }

    // Check two pair matches
    if (row[0] == row[1] || row[1] == row[2]) {
      switch (row[1]) {
        case 0 -> payout = bet * 2;
        case 1 -> payout = bet * 3;
        case 2 -> payout = bet * 4;
        case 3 -> payout = bet * 7;
      }
    }

    return payout;
  }
}

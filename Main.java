import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 21 - varargs

    Scanner scanner = new Scanner(System.in);

    System.out.println(average(1, 2, 3, 4, 5, 6, 7));

    scanner.close();

  }

  static double average(double... numbers) {
    if (numbers.length == 0) {
      return 0;
    }

    double sum = 0;
    for (double number : numbers) {
      sum += number;
    }

    return sum / numbers.length;
  }
}

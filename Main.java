import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();

    int dice = random.nextInt(1, 7);
    System.out.println(dice);

    double percent = random.nextDouble();
    System.out.println(percent);

    boolean coin = random.nextBoolean();

    if (coin) {
      System.out.println("HEADS");
    } else {
      System.out.println("TAILS");
    }

  }
}

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

  public static void main(String[] args) {
    // 38 - timer and timertask

    Timer timer = new Timer();

    try (Scanner scanner = new Scanner(System.in)) {

      System.out.print("Enter the # to countdown: ");
      int countdown = scanner.nextInt();

      TimerTask task = new TimerTask() {
        int count = countdown;

        @Override
        public void run() {

          if (count <= 0) {
            System.out.println("Happy new year!");
            timer.cancel();
          } else {
            System.out.println(count);
            count--;
          }
        }
      };

      timer.schedule(task, 0, 1000);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}

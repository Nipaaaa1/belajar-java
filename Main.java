import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 33 - exception

    // Put scanner inside the parentheses to automatically release the resource
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Input a number: ");
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (ArithmeticException e) {
      System.out.println("You can't divide by zero!");
    } catch (InputMismatchException e) {
      System.out.println("Please input a number");
    } finally {
      System.out.println("This always execute!");
    }

  }
}

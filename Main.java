import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // String .substring() example

    System.out.print("Enter your email: ");
    String email = scanner.nextLine();

    String username = email.substring(0, email.indexOf("@"));
    String domain = email.substring(email.indexOf("@") + 1);

    System.out.println(username);
    System.out.println(domain);

    scanner.close();
  }
}

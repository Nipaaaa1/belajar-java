public class Main {

  static int x = 3; // Class scope

  public static void main(String[] args) {

    // 17 - Variable scope

    System.out.println(x);

    int x = 2; // Local scope
    System.out.println(x);

    printX();
  }

  static void printX() {
    System.out.println(x); // Calls class scope
  }
}

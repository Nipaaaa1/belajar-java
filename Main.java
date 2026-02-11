public class Main {

  public static void main(String[] args) {
    // 22 - 2D array

    String[][] groceries = {
        { "banana", "kiwi", "apple" },
        { "onion", "celery", "potato" },
        { "beef", "chicken", "salmon" }
    };

    // Print 2D array
    print2DArray(groceries);

    // Accessing array
    groceries[0][2] = "pineapple";

    print2DArray(groceries);

  }

  static void print2DArray(String[][] arrays) {
    for (String[] array : arrays) {
      for (String item : array) {
        System.out.print(item + " ");
      }
      System.out.println();
    }

  }

}

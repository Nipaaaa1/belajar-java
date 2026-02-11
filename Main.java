import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // 19 - Arrays

    String[] fruits = { "apple", "maple", "banana", "kiwi" };

    System.out.println(fruits); // Print memory adresses

    // Print all member using fer loop
    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }

    // Print using enhanced for loop / for each
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    Arrays.sort(fruits);

    printArray(fruits);

    Arrays.fill(fruits, "banana");

    printArray(fruits);

  }

  static void printArray(String[] array) {
    for (String item : array) {
      System.out.println(item);
    }
  }
}

public class Main {

  public static void main(String[] args) {
    // 39 - generics

    Product<String, Double> product1 = new Product<>("Gamepad", 19.99);
    Product<String, Integer> product2 = new Product<>("Book", 10);

    product1.printDetail();
    product2.printDetail();
  }
}

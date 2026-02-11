public class Product<T, U> {
  T item;
  U price;

  Product(T item, U price) {
    this.item = item;
    this.price = price;
  }

  void printDetail() {
    System.out.println("Product detail");
    System.out.println("Name: " + this.item);
    System.out.println("Price: $" + this.price);
  }
}

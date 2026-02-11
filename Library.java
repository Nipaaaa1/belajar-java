public class Library {
  String name;
  int year;
  Book[] books;

  Library(String name, int year, Book[] books) {
    this.name = name;
    this.year = year;
    this.books = books;
  }

  void printBookList() {
    System.out.printf("The %s %s\n", this.year, this.name);
    for (Book book : this.books) {
      System.out.println(book.printInfo());
    }
  }
}

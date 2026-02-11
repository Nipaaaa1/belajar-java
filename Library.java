public class Library {
  String name;
  int year;
  Book[] books;
  Person librarian;

  Library(String name, int year, Book[] books, String librarian, int librarianAge) {
    this.name = name;
    this.year = year;
    this.books = books;
    this.librarian = new Person(librarian, librarianAge);
  }

  void printBookList() {
    System.out.printf("The %s %s\n", this.year, this.name);
    for (Book book : this.books) {
      System.out.println(book.printInfo());
    }
  }
}

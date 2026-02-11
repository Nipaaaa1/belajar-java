public class Main {

  public static void main(String[] args) {
    // 32 - compositions

    Book book1 = new Book("Wandering Witch", 392);
    Book book2 = new Book("Atomic Habits", 360);
    Book book3 = new Book("Go programming", 500);

    Book[] books = { book1, book2, book3 };

    Library library = new Library("Udin Perpus", 2026, books, "Wahyudi", 20);

    library.printBookList();

    library.librarian.greetings();
  }
}

public class Book {
  String name;
  int pages;

  Book(String name, int pages) {
    this.name = name;
    this.pages = pages;
  }

  String printInfo() {
    return this.name + " (" + this.pages + " pages)";
  }
}

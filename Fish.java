public class Fish extends Animal {
  Fish(String name) {
    super(name);
  }

  @Override
  void move() {
    System.out.println("This animal is swimming");
  }
}

public class Main {

  public static void main(String[] args) {
    // 27 - Class inheritence

    Dog wally = new Dog();
    Cat kitty = new Cat();
    Plant grass = new Plant();

    System.out.println(wally.isAlive);
    System.out.println(kitty.isAlive);
    System.out.println(grass.isAlive);

    wally.eat();
    kitty.move();
    grass.photosynthesize();
    wally.bark();
    kitty.meow();
  }
}

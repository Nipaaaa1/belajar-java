public class Car {
  String maker = "Ford";
  String model = "Mustang";
  boolean isRunning = false;

  void startEngine() {
    System.out.println("You start the engine");
    isRunning = true;
  }

  void stepEngine() {
    System.out.println("You step the engine");
    isRunning = false;
  }
}

public class Car {
  String maker;
  String model;
  boolean isRunning = false;

  Car(String maker, String model) {
    this.maker = maker;
    this.model = model;
  }

  void startEngine() {
    System.out.println("You start the engine");
    isRunning = true;
  }

  void stepEngine() {
    System.out.println("You step the engine");
    isRunning = false;
  }

  void printDetails() {
    System.out.println("Your car detail");
    System.out.println("Maker: " + this.maker);
    System.out.println("Model: " + this.model);
    System.out.println("Status (is running): " + this.isRunning);
  }
}

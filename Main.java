public class Main {

  public static void main(String[] args) {
    // 25 - Constructor

    Car car = new Car("Ford", "Mustang");
    System.out.println(car.maker + " " + car.model);
    car.startEngine();
    System.out.println(car.isRunning);
    car.stepEngine();
    System.out.println(car.isRunning);
    car.printDetails();
  }
}

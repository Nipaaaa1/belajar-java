public class Main {

  public static void main(String[] args) {
    // 24 - Objects

    Car car = new Car();
    System.out.println(car.maker + " " + car.model);
    car.startEngine();
    System.out.println(car.isRunning);
    car.stepEngine();
    System.out.println(car.isRunning);
    ;

  }
}

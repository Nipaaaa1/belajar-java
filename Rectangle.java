public class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  @Override
  double area() {
    return this.width * this.length;
  }
}

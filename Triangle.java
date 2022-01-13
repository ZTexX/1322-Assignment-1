public class Triangle {
  private double side1, side2, side3;

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public Triangle() {
    this.side1 = 3;
    this.side2 = 4;
    this.side3 = 5;
  }

  public double perimeter() {
    return (side1 + side2 + side3);
  }

  public double area() {
    double p = perimeter() / 2;
    return Math.sqrt((p*(p-side1)*(p-side2)*(p-side3)));
  }

  public double height() {
    double smallest = Math.min(Math.min(side1, side2), side3);
    return ((area() * 2) / smallest);
  }

  public String toString() {
    return String.format("Triangle has sides %f, %f, and %f. It has an area of %f, a perimeter of %f, and a height of %f.", side1, side2, side3, area(), perimeter(), height());
  }
}
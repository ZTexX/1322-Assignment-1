import java.text.DecimalFormat;

class Main {
  private static DecimalFormat df = new DecimalFormat("0.#");

  public static void main(String[] args) {
    for (int i = 0; i < 9; i++) {
      Circle circle = new Circle(i + 1);

      System.out.println("Area of a circle with radius " + (i + 1) + " is " + (circle.area() % 1 == 0 ? df.format(circle.area()) : circle.area()) + " circumference is " + (circle.circumference() % 1 == 0 ? df.format(circle.circumference()) : circle.circumference()));
    }
    System.out.println();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        Rectangle rect = new Rectangle(i + 1, j + 1);

        System.out.println("Area of rectangle " + (i + 1) + " by " + (j + 1) + " is " + (rect.area() % 1 == 0 ? df.format(rect.area()) : rect.area()) + " it's perimeter is " + (rect.perimeter() % 1 == 0 ? df.format(rect.perimeter()) : rect.perimeter()));
      }
    }
    System.out.println();

    Triangle triangle = new Triangle(18, 30, 24);

    System.out.println("Area of a triangle 18x30x24 is " + (triangle.area() % 1 == 0 ? df.format(triangle.area()) : triangle.area()) + " it's perimeter is " + (triangle.perimeter() % 1 == 0 ? df.format(triangle.perimeter()) : triangle.perimeter()) + " and it's height is " + (triangle.height() % 1 == 0 ? df.format(triangle.height()) : triangle.height()) + "\n");

    Triangle triangle2 = new Triangle();

    System.out.println("Area of a triangle 3x4x5 is " + (triangle2.area() % 1 == 0 ? df.format(triangle2.area()) : triangle2.area()) + " it's perimeter is " + (triangle2.perimeter() % 1 == 0 ? df.format(triangle2.perimeter()) : triangle2.perimeter()) + " and it's height is " + (triangle2.height() % 1 == 0 ? df.format(triangle2.height()) : triangle2.height()));
  }
}
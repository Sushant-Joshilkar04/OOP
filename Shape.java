import java.util.Scanner;

abstract class Shape{
   protected double num1;
   protected double num2;
    public Shape(double dim1, double dim2) {
        num1 = dim1;
        num2 = dim2;
    }

    abstract public double computeArea();
}

class Triangle extends Shape{
    public Triangle(double base, double height) {
        super(base, height);
    }
  @Override
  public double computeArea() {
      return 0.5*num1*num2;
  }
}

class Rectangle extends Shape{
    public Rectangle(double length, double width) {
        super(length, width);
    }
    @Override
    public double computeArea() {
        return num1*num2;
    }
}
public class Assignment_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = sc.nextDouble();


        Shape triangle = new Triangle(base, height);
        double triangleArea = triangle.computeArea();
        System.out.println("Area of the triangle: " + triangleArea);

        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        
        Shape rectangle = new Rectangle(length, width);
        double rectangleArea = rectangle.computeArea();
        System.out.println("Area of the rectangle: " + rectangleArea);

    }
}

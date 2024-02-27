// Base class representing a shape
abstract class Shape {
    // Fields
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    abstract double calculateArea();

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Derived class representing a rectangle, inheriting from Shape
class Rectangle extends Shape {
    // Fields
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() method to calculate area of rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Derived class representing a circle, inheriting from Shape
class Circle extends Shape {
    // Field
    private double radius;

    // Constructor
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    // Override calculateArea() method to calculate area of circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Derived class representing a triangle, inheriting from Shape
class Triangle extends Shape {
    // Fields
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // Override calculateArea() method to calculate area of triangle
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of class Rectangle, Circle, and Triangle
        Rectangle rectangle = new Rectangle(5, 10, "Blue");
        Circle circle = new Circle(7, "Red");
        Triangle triangle = new Triangle(4, 6, "Green");

        // Calculating and printing areas of shapes
        System.out.println("Area of Rectangle (Color: " + rectangle.getColor() + "): " + rectangle.calculateArea());
        System.out.println("Area of Circle (Color: " + circle.getColor() + "): " + circle.calculateArea());
        System.out.println("Area of Triangle (Color: " + triangle.getColor() + "): " + triangle.calculateArea());
    }
}

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(4);

        System.out.println("Circle Area = " + String.format("%.1f", circle.calculateArea()));
        System.out.println("Rectangle Area = " + rectangle.calculateArea());
        System.out.println("Square Area = " + square.calculateArea());
    }
}
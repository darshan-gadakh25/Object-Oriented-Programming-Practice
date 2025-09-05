import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle of radius " + (int)radius);
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void draw() {
        System.out.println("Drawing Rectangle of length " + (int)length + " and breadth " + (int)breadth);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        c.draw();

        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(l, b);
        r.draw();
    }
}

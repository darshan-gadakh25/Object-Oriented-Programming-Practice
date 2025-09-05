import java.util.Scanner;

class ShapeArea {
    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class AreaOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        double r = sc.nextDouble();

        ShapeArea sa = new ShapeArea();
        System.out.println("Square Area = " + sa.calculateArea(side));
        System.out.println("Rectangle Area = " + sa.calculateArea(l, b));
        System.out.println("Circle Area = " + String.format("%.2f", sa.calculateArea(r)));
    }
}

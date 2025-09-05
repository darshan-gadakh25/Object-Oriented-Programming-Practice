import java.util.Scanner;

abstract class shape{
    abstract double area();
}
class Rectangle extends shape{
    private double length;
    private double breath;

    Rectangle(double length, double breath){
        this.length=length;
        this.breath=breath;
    }

    @Override
    double area() {
       double area= length * breath;
       return area;
    }

}

class Circle extends shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double area() {
         double area= 3.14 * radius * radius;
       return area;
    }
}

public class Calculation {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length for rectangle: ");
        double length=sc.nextDouble();
        System.out.println("Enter the breath for rectangle: ");
        double breath=sc.nextDouble();

        System.out.println("Enter the radius for circle: ");
        double radius=sc.nextDouble();

        Rectangle ac=new Rectangle(length, breath);
        System.out.println("area of rectangle: "+ac.area());

        Circle cr= new Circle(radius);
        System.out.println("area of Circle: "+cr.area());


    }
    
    
}
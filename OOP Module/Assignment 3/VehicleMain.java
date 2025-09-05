import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    String modelType;

    Car(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Car → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

class Bike extends Vehicle {
    String modelType;

    Bike(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.next();
        int speed = sc.nextInt();
        String model = sc.next();
        Car car = new Car(brand, speed, model);
        car.display();

        brand = sc.next();
        speed = sc.nextInt();
        model = sc.next();
        Bike bike = new Bike(brand, speed, model);
        bike.display();
    }
}

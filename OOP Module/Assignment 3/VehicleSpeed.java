
class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}
class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}
class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}
public class VehicleSpeed {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.displaySpeed();
        v2.displaySpeed();
    }
}
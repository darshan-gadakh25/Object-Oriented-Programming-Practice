class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;

    static int vehicleCount = 0; 

    public Vehicle(String ownerName, String vehicleType) {
        vehicleCount++; 
        this.regNo = "MH-2025-" + vehicleCount;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Darshan", "Car");
        Vehicle v2 = new Vehicle("Rohit", "Bike");

        System.out.println("Vehicle 1: " + v1.getRegNo() + " Owner name " + v1.getOwnerName() + " Vehicle type " + v1.getVehicleType());
        System.out.println("Vehicle 2: " + v2.getRegNo() + " Owner name " + v2.getOwnerName() + " Vehicle type " + v2.getVehicleType());

        System.out.println("Total Vehicles Registered: " + Vehicle.getVehicleCount());
    }
}

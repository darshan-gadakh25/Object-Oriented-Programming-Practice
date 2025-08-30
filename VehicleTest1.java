class Vehicle {
    String regNo = "MH-2025-" ;
     String ownerName;
     String vehicleType;

     static int vehicleCount = 0; 
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }
    public Vehicle(String ownerName, String vehicleType) {
        
        this.regNo = vehicleCount;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
	vehicleCount++;
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
        System.out.println("Vehicle 2: " + v2.getRegNo() + "owner name " + v2.getOwnerName() + " Vehicle type " + v2.getVehicleType());
    }
}

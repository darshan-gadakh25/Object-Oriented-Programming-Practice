interface LandVehicle {
    void driveOnLand();
}

interface WaterVehicle {
    void driveOnWater();
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    String name;

    AmphibiousVehicle(String name) {
        this.name = name;
    }

    public void driveOnLand() {
        System.out.println(name + " → Driving on Land");
    }

    public void driveOnWater() {
        System.out.println(name + " → Driving on Water");
    }
}

public class VehicleTypes {
    public static void main(String[] args) {
        AmphibiousVehicle av = new AmphibiousVehicle("HydroCar");
        av.driveOnLand();
        av.driveOnWater();
    }
}
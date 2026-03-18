import java.util.*;

abstract class AbstractVehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class PetrolCar extends AbstractVehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends AbstractVehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class Pr5_2 {
    public static void main(String[] args) {
        System.out.println("Name: Jwalin Enr: 250413107015");

        AbstractVehicle myCar = new PetrolCar();
        AbstractVehicle myBike = new Bike();

        System.out.println("Car - Fuel: " + myCar.fuelType() + ", Wheels: " + myCar.noOfWheels());
        System.out.println("Bike - Fuel: " + myBike.fuelType() + ", Wheels: " + myBike.noOfWheels());
    }
}

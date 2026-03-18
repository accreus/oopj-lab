import java.util.*;

class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vNum, String brnd, String fuel) {
        this.vehicleNumber = vNum;
        this.brand = brnd;
        this.fuelType = fuel;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vNum, String brnd, String fuel, int seats, boolean ac) {
        super(vNum, brnd, fuel); // Invoking parent constructor
        this.numberOfSeats = seats;
        this.ACavailable = ac;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Invoking parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + (ACavailable ? "Yes" : "No"));
    }
}

class ElectricCar extends Car {
    protected int batteryCapacity;
    protected int chargingTime;

    ElectricCar(String vNum, String brnd, int seats, boolean ac, int capacity, int cTime) {
        super(vNum, brnd, "Electric", seats, ac);
        this.batteryCapacity = capacity;
        this.chargingTime = cTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hrs");
    }
}

public class Pr4_2 {
    public static void main(String[] args) {
        System.out.println("Name: Jwalin Enr: 250413107015");

        Vehicle v1 = new Vehicle("MH12-1234", "Honda", "Petrol");
        Car c1 = new Car("MH14-5678", "Toyota", "Diesel", 5, true);
        ElectricCar ec1 = new ElectricCar("MH15-9999", "Tesla", 5, true, 75, 8);

        System.out.println("--- Normal Car ---");
        c1.displayDetails();

        System.out.println("\n--- Electric Car ---");
        ec1.displayDetails();

        System.out.println("\n--- Upcasting and Downcasting ---");
        // Upcasting
        Vehicle v2 = new ElectricCar("DL10-1111", "Tata", 4, true, 30, 6);
        v2.displayDetails();

        // Downcasting with instanceof
        if (v2 instanceof ElectricCar) {
            ElectricCar ec2 = (ElectricCar) v2;
            System.out.println("Downcasting successful! Battery: " + ec2.batteryCapacity + " kWh");
        }
    }
}

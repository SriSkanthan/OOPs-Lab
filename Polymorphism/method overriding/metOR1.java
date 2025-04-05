class Vehicle {
    String fuelType = "Unknown";

    void startEngine() {
        System.out.println("[Vehicle] Engine is starting...");
    }

    void fuelStatus() {
        System.out.println("[Vehicle] Fuel type: " + fuelType);
    }
}

class Car extends Vehicle {
    Car() {
        fuelType = "Petrol";
    }

    @Override
    void startEngine() {
        super.startEngine(); // Calls Vehicle's method
        System.out.println("[Car] Ignition key turned. Car engine started.");
    }

    @Override
    void fuelStatus() {
        System.out.println("[Car] This car uses: " + fuelType);
    }
}

class ElectricCar extends Car {
    ElectricCar() {
        fuelType = "Electric";
    }

    @Override
    void startEngine() {
        System.out.println("[ElectricCar] Silent startup activated. Battery engaged.");
    }

    @Override
    void fuelStatus() {
        System.out.println("[ElectricCar] Battery level: 95%");
    }
}

public class metOR1{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.startEngine();
        v.fuelStatus();

        System.out.println("\n---");

        Car c = new Car();
        c.startEngine();
        c.fuelStatus();

        System.out.println("\n---");

        ElectricCar ec = new ElectricCar();
        ec.startEngine();
        ec.fuelStatus();
    }
}

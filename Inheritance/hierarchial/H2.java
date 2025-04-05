class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    public void carDetails() {
        displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}

class Bike extends Vehicle {
    private boolean hasHelmet;

    public Bike(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    public void bikeDetails() {
        displayInfo();
        System.out.println("Helmet Included: " + (hasHelmet ? "Yes" : "No"));
    }
}

public class H2{
    public static void main(String[] args) {
        Car car = new Car("Tesla", 200, 4);
        Bike bike = new Bike("Yamaha", 150, true);

        car.carDetails();
        System.out.println();
        bike.bikeDetails();
    }
}

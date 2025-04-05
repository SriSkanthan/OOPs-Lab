interface CartItem {
    double calculatePrice();
    void displayDetails();
}

class ClothingItem implements CartItem {
    double price;
    String size;

    ClothingItem(double price, String size) {
        this.price = price;
        this.size = size;
    }

    public double calculatePrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Clothing Item: Size " + size + " - Price: $" + price);
    }
}

class ElectronicsItem implements CartItem {
    double price;
    String brand;

    ElectronicsItem(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public double calculatePrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Electronics Item: " + brand + " - Price: $" + price);
    }
}

public class intf3{
    public static void main(String[] args) {
        CartItem clothing = new ClothingItem(29.99, "M");
        clothing.displayDetails();
        System.out.println("Total Price: $" + clothing.calculatePrice());

        CartItem electronics = new ElectronicsItem(199.99, "Sony");
        electronics.displayDetails();
        System.out.println("Total Price: $" + electronics.calculatePrice());
    }
}

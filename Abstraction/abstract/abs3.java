abstract class Customer {
    String name;
    String accountNumber;

    Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    abstract void displayDetails();
}

class RegularCustomer extends Customer {
    RegularCustomer(String name, String accountNumber) {
        super(name, accountNumber);
    }

    void displayDetails() {
        System.out.println("Regular Customer: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

class PremiumCustomer extends Customer {
    PremiumCustomer(String name, String accountNumber) {
        super(name, accountNumber);
    }

    void displayDetails() {
        System.out.println("Premium Customer: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Special Benefits: Higher Withdrawal Limits, Priority Support");
    }
}

public class abs3{
    public static void main(String[] args) {
        Customer regular = new RegularCustomer("John Doe", "12345");
        regular.displayDetails();

        Customer premium = new PremiumCustomer("Jane Smith", "67890");
        premium.displayDetails();
    }
}

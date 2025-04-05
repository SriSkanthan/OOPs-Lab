abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.03;
        balance += interest;
        System.out.println("Interest added to Savings Account: $" + interest);
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.01;
        balance += interest;
        System.out.println("Interest added to Checking Account: $" + interest);
    }
}

public class  abs1{
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.calculateInterest();
        System.out.println("Balance: $" + savings.getBalance());

        BankAccount checking = new CheckingAccount(2000);
        checking.withdraw(1000);
        checking.calculateInterest();
        System.out.println("Balance: $" + checking.getBalance());
    }
}

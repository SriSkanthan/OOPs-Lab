class Account {
    double balance = 1000;
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class Bank{
    public static void main(String[] args) {
        Account acc = new Account();
        for (int i = 0; i < 3; i++) {
            acc.deposit(200);
            acc.withdraw(100);
        }
        acc.showBalance();
    }
}

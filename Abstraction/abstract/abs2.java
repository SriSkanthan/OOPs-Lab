abstract class Transaction {
    double amount;

    Transaction(double amount) {
        this.amount = amount;
    }

    abstract void processTransaction();
}

class Deposit extends Transaction {
    Deposit(double amount) {
        super(amount);
    }

    void processTransaction() {
        System.out.println("Depositing: $" + amount);
    }
}

class Withdrawal extends Transaction {
    Withdrawal(double amount) {
        super(amount);
    }

    void processTransaction() {
        System.out.println("Withdrawing: $" + amount);
    }
}

public class abs2{
    public static void main(String[] args) {
        Transaction deposit = new Deposit(200);
        deposit.processTransaction();

        Transaction withdrawal = new Withdrawal(100);
        withdrawal.processTransaction();
    }
}

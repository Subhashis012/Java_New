package Java.Exception;

public class BankAccount {
    private double balance;
    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws Exception {
        if(amount > balance) {
            //throw new Exception("Insufficient Balance");
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
}

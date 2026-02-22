package Java.Exception;

// Custom exception
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("What do  you want to do? You don't have enough money.");
    }
}

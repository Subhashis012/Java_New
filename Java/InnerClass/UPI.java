package Java.InnerClass;

public class UPI implements Payment {
    private String upiId;
    public UPI(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Upi Id: " + upiId + " Paid " + amount + " using UPI id");
    }
}

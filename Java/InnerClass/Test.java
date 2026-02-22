package Java.InnerClass;

public class Test {
    public static void main(String[] args) {
//        Car car = new Car("Tata Safari");
//        Car.Engine engine =  car.new Engine();
//        engine.start();
//        engine.stop();
//        Car car = new Car("Tesla");
//        Engine engine = new Engine(car);
//        engine.Start();
//            Computer computer = new Computer("Dell","ABC", "Windows");
//            computer.getOs().displayInfo();
//            Computer.USB usb = new Computer.USB("XYZ");
//            usb.displayInfo();
//        ShoppingCart shoppingCart = new ShoppingCart(150);
//
////        Anonymous Inner Class Example
//        shoppingCart.processPayment(new Payment() {
//            @Override
//            public void pay(double amount) {
//                System.out.println("Paid " + amount + " using UPI id");
//            }
//        });
        // UPI upi = new UPI("1234");
        //shoppingCart.processPayment(upi);

        Hotel hotel = new Hotel("Taj",10,5);
        hotel.reserveRoom("Subhashis",5);
        hotel.reserveRoom("Akshit",2);

    }
}

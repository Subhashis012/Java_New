package Java.vehicles;

public final class Car extends Vehicle {
    private final int speedLimit = 200;

    public Car() {
       // speedLimit = 100;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public final void airBags() {
        System.out.println("4 Air bags");
    }
}

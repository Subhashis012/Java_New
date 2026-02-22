package Java.MultiThreding;

public class LambdaExpression {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World");
//            }
//        };
//        Thread t1  = new Thread(runnable);
//        t1.start();
        Runnable runnable = () -> {
            System.out.println("Hello World");
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}

package Java.MultiThreding;

public class Test {
    public static void main(String[] args) {
      //  System.out.println("Hello World");  // Main Thread calling
      //   System.out.println(Thread.currentThread().getName());  // Main Thread
        World t1 = new World();
        // Thread t1 = new  Thread(world);
        t1.run();
        for(; ; ) {
            System.out.println("Hello");
        }

    }
}

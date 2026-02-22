package Java.MultiThreding;

public class Test2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread2 t1 = new MyThread2(counter);
        MyThread2 t2 = new MyThread2(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println(counter.getCount());
    }
}

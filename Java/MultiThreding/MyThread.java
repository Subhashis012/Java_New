package Java.MultiThreding;

class MyThread extends Thread {

//    public MyThread(String name) {
//        super(name);
//    }
    @Override
    public void run() {
//        System.out.println("Running");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

//        for (int i = 0; i < 5; i++) {
//            String a = "";
//            for(int j = 0; j< 1000000000; j++) {
//                a += "a";
//            }
//            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
//            try{
//                Thread.sleep(10);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }

        // Interrupt Method example
//        try{
//            Thread.sleep(1000);
//            System.out.println("Thread is running .....");
//        } catch(InterruptedException e){
//            System.out.println("Thread interrupted " + e);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " is running");
//            Thread.yield();
//        }

        while (true) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) throws InterruptedException {
       // MyThread t1 = new MyThread("Subhashis");
        //t1.setPriority(Thread.MIN_PRIORITY);
     //   t1.start();
//        MyThread l = new MyThread("Low Priority Thread");
//        MyThread m = new MyThread("Medium Priority Thread");
//        MyThread n = new MyThread("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        n.setPriority(Thread.MAX_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        l.start();
//        m.start();
//        n.start();
//        System.out.println(t1.getState());
//        System.out.println(Thread.currentThread().getState());
//        Thread.sleep(100);
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println("Hello");
//
         // Interrupt method example
//        MyThread t1 = new MyThread();
//        t1.start();
//        t1.interrupt();
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.start();
//        t2.start();

        // Daemon Thread
//        MyThread t1 = new MyThread();
//        t1.setDaemon(true);
//        t1.start();
//        System.out.println("Main Finish");


    }
}

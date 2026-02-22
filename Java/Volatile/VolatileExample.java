package Java.Volatile;

class SharedResource {
    private volatile boolean flag = false;

    public void setFlagTru(){
        System.out.println("setFlagTru");
        flag = true;
    }

    public void printIfFlagTrue() {
        while(!flag){
            // Do nothing
        }
        System.out.println("Flag is true!");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedResource sharedObj =  new SharedResource();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTru();
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());
        writerThread.start();
        readerThread.start();
    }
}

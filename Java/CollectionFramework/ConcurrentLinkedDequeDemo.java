package Java.CollectionFramework;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    static void main(String[] args) {
        // non-blocking, thread-safe double-ended queue
        // CAS
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("Element0");
        deque.addLast("Element2");
        System.out.println(deque);

        String first = deque.removeFirst();
        String last = deque.removeLast();
    }
}

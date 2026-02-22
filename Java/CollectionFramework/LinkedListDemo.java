package Java.CollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;

class Node {
    public int value;
    public Node next;
}

public class LinkedListDemo {
    static void main() {

//        Node node1 = new Node();
//        Node node2 = new Node();
//        node1.value = 1;
//        node1.value = 2;
//        node1.next = node2;
//        node2.next = null;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2); // O(n)
        linkedList.addLast(4); // O(1)
        linkedList.addFirst(0); // O(1)
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}

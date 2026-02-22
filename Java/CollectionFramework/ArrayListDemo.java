package Java.CollectionFramework;


import Java.test.Student;

import java.util.*;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

public class ArrayListDemo {
    static void main() {
//        List<Integer> list = new ArrayList<>(11);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(6);
//        list.add(4);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);


        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 3.6));
        students.add(new Student("Subhashis", 3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//        students.sort((o1, o2) -> {
//            if (o2.getGpa() - o1.getGpa() > 0) {
//                return 1;
//            } else if (o2.getGpa() - o1.getGpa() < 0) {
//                return -1;
//            } else {
//                return 0;
//            }
//        });
        students.sort(comparator);
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }

        // System.out.println(list.getClass().getName());
//
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("Watermelon");
//        fruits.add("Pineapple");
//
////        Collections.sort(fruits);
////        System.out.println(fruits);
//
//        List<String> words = Arrays.asList("banana", "apple", "date");
//        words.sort((a,b) -> b.length() - a.length());
//        System.out.println(words);

//        fruits.remove("Apple");
//        System.out.println(fruits);

        /*
        List<String> list1 = Arrays.asList("Monday, Tuesday");
        System.out.println(list1.getClass().getName());


        String[] array = {"Apple", "Grave", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);

        */


//        list.add(1);
//        list.add(5);
//        list.add(10);
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        for(int i=0;i<list.size();i++) {
//            System.out.println(list.get(i));
//        }

//        for(int x:list) {
//            System.out.println(x);
//        }
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(80));
        //list.remove(2);
//        for(int x:list) {
//            System.out.println(x);
//        }
        // list.add(2, 50);
//        list.set(2, 50);
//        System.out.println(list);
    }
}

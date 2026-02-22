package Java.Generics;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}


public class Test2 {
    public static void main(String[] args) {
//        Day day = Day.SUNDAY;
//        System.out.println(day);
//       // Day dayy = "MONDAY";
        Integer[] array = {1,2,3,4,5};
        printArray(array);
        String[] stringArray = {"A","B","C","D","E"};
        printArray(stringArray);
        display(12);
        display(12.1);
    }

    public static  <T> void display(T element){
        System.out.println("Generic display: "+element);
    }

    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

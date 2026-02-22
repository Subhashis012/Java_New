package Java.Enum;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // System.out.println(DayClass.MONDAY);
        System.out.println(Day.MONDAY);
        System.out.println(Day.SUNDAY);
        Day monday = Day.MONDAY;
        Day friday = Day.FRIDAY;
        System.out.println((monday.ordinal()));
//        monday.name();
        System.out.println(monday.name());
        Day enumDay = Day.valueOf("SATURDAY");
        System.out.println(enumDay);
        Day []val =  Day.values();
        for(Day i:val){
            System.out.println(i);
        }
        enumDay.display();
    }
}

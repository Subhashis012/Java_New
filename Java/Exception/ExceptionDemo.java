package Java.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
//    public static void main(String[] args) {
//        int[] numerators = {10,200,30,40};
//        int[] denominators = {1,2,0,4};
//        for(int i=0;i<numerators.length;i++){
//            System.out.println(divide(numerators[i], denominators[i]));
//        }
//        System.out.println("Done!");
//    }
//    public static int divide(int a, int b){
//        try {
//            return a/b;
//        }catch (ArithmeticException e){
//            System.out.println(e);
//          return -1;
//
//        }
//    }
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))){
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
    }
    public static int divide(int a, int b) {
        try{
           return a/b;
        } catch (Exception e) {
            return -1;
        }finally {
            System.out.println("Bye");
        }
    }
}

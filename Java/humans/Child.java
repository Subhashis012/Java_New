package Java.humans;

public class Child extends  Parent{
    public Child(String name, int age) {
        super(name, age);
        System.out.println("Child Called");
    }

    public void childMethod(){
        super.parentMethod();
        System.out.println("Child method Called");
    }
}

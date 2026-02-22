package Java.humans;

public class Parent extends  Grandparent{

    public Parent(String name, int age) {
        super(name,age);
        System.out.println("Parent Called");
    }

    public void parentMethod(){

        System.out.println("Parent method Called");
    }
}

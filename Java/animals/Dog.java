package Java.animals;

public class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Barks");
    }

    public void sayBye() {
        System.out.println("Bark Bark");
    }
}

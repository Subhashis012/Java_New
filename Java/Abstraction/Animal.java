package Java.Abstraction;

public abstract class Animal {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();  // Abstract Method

    public void sleep() {   // Concrit Method
        System.out.println("zzz...");
    }
}

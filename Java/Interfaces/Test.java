package Java.Interfaces;

import Java.Interfaces.animals.Animal;
import Java.Interfaces.animals.Cat;
import Java.Interfaces.animals.Dog;
import Java.Interfaces.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//        dog.sleep();
//        Cat cat = new Cat();
//        cat.eat();
//        cat.sleep();
//        System.out.println(Dog.MAX_AGE);
//        System.out.println(Animal.MAX_AGE);
//        Animal.info();
//        dog.run();
//        cat.run();
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("12222222");
        smartPhone.makeCall("12222222");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}

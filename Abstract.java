abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animals are sleeping");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog a = new Dog();

        a.sound();
        a.sleep();
    }
}

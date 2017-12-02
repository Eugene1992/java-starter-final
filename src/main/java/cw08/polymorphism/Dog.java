package cw08.polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i'm " + name + "! I'm dog");
    }
}

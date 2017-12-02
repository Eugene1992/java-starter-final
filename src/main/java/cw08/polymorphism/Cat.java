package cw08.polymorphism;

public class Cat extends HomeCat {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i'm " + name + "! I'm cat");
    }
}

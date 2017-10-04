package cw08.polymorphism;

public class HomeCat extends Animal {

    public HomeCat(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("Hello, i'm " + super.name + "! I'm home cat");
    }
}

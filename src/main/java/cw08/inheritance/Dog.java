package cw08.inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void sayHello() {
        System.out.println("Hello, i'm " + name);
    }
}

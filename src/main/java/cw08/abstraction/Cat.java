package cw08.abstraction;

public class Cat extends HomeCat {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void f() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i'm " + name + "! I'm cat");
    }

    @Override
    public int calcSomething() {
        return 0;
    }
}

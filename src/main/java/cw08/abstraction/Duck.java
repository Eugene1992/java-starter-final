package cw08.abstraction;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i'm " + name + "! I'm duck");
    }

    @Override
    public int calcSomething() {
        return 0;
    }
}

package cw08.abstraction;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public abstract int calcSomething();

    public void print() {
        int i = calcSomething();
        i = i * 2;
        for (int j = 0; j < i; j++) {
            System.out.println(name);
        }
    }
}

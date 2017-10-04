package cw08.inheritance;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

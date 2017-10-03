package cw07;

public class Human {
    public String name;
    public int age;
    public int salary;

    Human() {
    }

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name);
    }
}

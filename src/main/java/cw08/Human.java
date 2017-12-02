package cw08;

// public - everywhere access
// protected - in package, in childs, in class
// package-private - in class, in package
// private - in class
public class Human {
    private String name;
    private int age;
    private int salary;
    private int number;
    public static final int COUNT = 0;

    Human() {
    }

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
//        COUNT++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException();
        }
        this.salary = salary;
    }

    public void f1() {
        common(1);
    }

    public void f2() {
        common(2);
    }

    private void common(int arg) {

    }

    public int getNum() {
        return number;
    }

    public void setNum(int num) {
        this.number = num;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
        System.out.println(COUNT);
    }

    static void printHumanCount(Human human) {
        System.out.println(human.name);
        human.sayHello();
        System.out.println(COUNT);
    }
}

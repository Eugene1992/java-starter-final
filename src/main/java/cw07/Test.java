package cw07;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Human("Alex", 22, 500);

        Human h2 = new Human();
        h2.age = 23;
        h2.name = "Peter";
        h2.salary = 900;

        Human h3 = new Human();
        h3.age = 26;
        h3.name = "Eugene";
        h3.salary = 700;

        Human[] humans = {h1, h2, h3};

//        System.out.println(richestEmployee.name);

        h1.sayHello();
        h2.sayHello();
    }


}

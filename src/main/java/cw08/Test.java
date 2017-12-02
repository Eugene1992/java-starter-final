package cw08;

import static cw08.Human.printHumanCount;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Human("Alex", 22, 500);
        System.out.println(Human.COUNT);
        Human h2 = new Human("Alex", 22, 500);
        Human h3 = new Human("Alex", 22, 500);

//        h1.setSalary(-1000);

//        System.out.println(h1.getNum());

        printHumanCount(null);

        new Test().f();
    }


    public void f() {

    }
}

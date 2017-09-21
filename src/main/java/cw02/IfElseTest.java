package cw02;

public class IfElseTest {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello if true!");
        } else {
            System.out.println("Hello if false!");
        }

        System.out.println("Start");
        int a = 0;
        if (a > 0) {
            System.out.println("a > 0");
        } else if (a < 0) {
            System.out.println("a < 0");
        } else {
            System.out.println("a == 0");
        }

        System.out.println("End");
    }
}

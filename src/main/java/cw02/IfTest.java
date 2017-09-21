package cw02;

public class IfTest {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello if true!");
        }

        boolean b = 10 > 5;
        if (b) {
            System.out.println("Hello if true!");
        }

        int a = 10;
        if (a > 0) { // > < == != >= <=
            System.out.println("Hello if true!");
        }

//        int c = 10; // error
        if (10 > 0) {
            int c = 10; // error
            System.out.println(c);
        }
        int c = 10; // error
    }
}

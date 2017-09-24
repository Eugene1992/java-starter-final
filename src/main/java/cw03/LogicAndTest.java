package cw03;

public class LogicAndTest {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;
        int c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
        }

        if (a > b && a > c) { // short schema
            System.out.println(a);
        }

        if (a < b & a / 0 == 10) { // full schema
            System.out.println(a);
        }
    }
}

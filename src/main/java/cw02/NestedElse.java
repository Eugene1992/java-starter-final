package cw02;

public class NestedElse {
    public static void main(String[] args) {
        int a = 10;
        if (a > 0) {
            if (a != 5) {
                System.out.println("a > 0 AND a != 5");
            }
            System.out.println("a > 0");
        }
    }
}

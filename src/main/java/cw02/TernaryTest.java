package cw02;

public class TernaryTest {
    public static void main(String[] args) {
        int a = 0;
        int b;

        if (a > 0) {
            b = 1;
        } else {
            b = 0;
        }

//              condition ? if true : if false;
        int c = a > 0     ?    1    :     0   ;


        System.out.println(b);
        System.out.println(c);

        int d = a > 0 ? b > 5 ? 0 : 1 : -1;

        if (a > 0) {
            if (b > 5) {
                d = 0;
            } else {
                d = 1;
            }
        } else {
            d = -1;
        }
    }
}

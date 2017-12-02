package cw03;

public class ForTest {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            System.out.println(count);
        }

        int count = 0;
        for (; count < 10; ) {
            System.out.println(count);
            count++;
        }

        for (int a = 0, b = 10; a < 10 && b != 100; a++, b--) {
            System.out.println(a);
            System.out.println(b);
        }
    }
}

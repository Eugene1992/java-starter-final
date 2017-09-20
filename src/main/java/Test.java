public class Test {
    public static void main(String[] args) {
//        Ctrl + /
/*        Ctrl + Shift + / */
//        Format code Ctrl + Alt + l (Code -> Reformat code)
//        Duplicate line Ctrl + d
//        Delete line Shift + delete
//        Ctrl + Shift + Enter auto complete
        byte a;
        byte b = 10; // -128 ... 127
        byte c = 7, d, e = 10;

        boolean b1 = true;
        boolean b2 = false;

        char c1 = 'g';
        char c2 = 121; // 0 ... 65535
        char c3 = '\u1234';

//        - 2^n-1 ... 2^n-1 - 1

        short s = 32767;  // -32768 ... 32767

        int i = 2_000_000;

        long l = 100000000000L;

        double d1 = 10;
        double d2 = 10.0000;

        float f = 10.00f;

        System.out.println(f);

        int k = 20;
        int m = 9;

        System.out.println(k + m);
        System.out.println(k - m);
        System.out.println(k * m);
        System.out.println(k / m);
        System.out.println(k % m);

        System.out.print("Hello");
        System.out.println("Hello");
        System.out.print("Hello");
        System.out.println();

        System.out.println("k = " + k + ", m = " + m);
        System.out.printf("k = %s, m = %s", k, m);

        int x = 10;
        int z = 20;

        System.out.println(x);
        System.out.println(z);
    }
}

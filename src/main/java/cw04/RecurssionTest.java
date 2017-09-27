package cw04;

public class RecurssionTest {
    public static void main(String[] args) {
//        1 1 2 3
        System.out.println(f(5));

    }

    static int f(int n) {
        System.out.print(n + " ");
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return f(n - 1) + f(n - 2);
    }
}

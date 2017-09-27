package cw04;

public class NestedMethodCallsTest {
    public static void main(String[] args) {
        calcEquation(10, 13, 4);
    }

    static void calcEquation(int a, int b, int c) {
        int discr = calcDiscr(a, b, c);
        System.out.println(getEauationRoot(discr, b, a));
    }

    static int calcDiscr(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    static double getEauationRoot(int discr, int b, int a) {
        return (-b + Math.sqrt(discr)) / (2 * a);
    }
}

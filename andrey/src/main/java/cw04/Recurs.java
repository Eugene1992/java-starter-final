package cw04;

public class Recurs {
    public static void main(String[] args) {
        int fac = recurss(5);
        System.out.println(fac);
    }

    static int recurss(int a) {
        if (a == 0) return 1;
        return recurss(a - 1) * a;
    }
}

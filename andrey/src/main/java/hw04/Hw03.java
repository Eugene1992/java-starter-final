package hw04;

public class Hw03 {
    public static void main(String[] args) {
        System.out.println("Number of lucky tickets:  " + sumlucky());
    }

    static int sumlucky() {
        int x1, x2, x3, x4, x5, x6, z, k = 0;
        for (int i = 1; i < 999999; i++) {
            x6 = i / 100000;
            x1 = i % 10;
            z = i % 100;
            x2 = z / 10;
            z = i % 1000;
            x3 = z / 100;
            z = i % 10000;
            x4 = z / 1000;
            z = i % 100000;
            x5 = z / 10000;
            if (x1 + x2 + x3 == x4 + x5 + x6) {
                k++;
                System.out.println(i);
            }
        }
        return k;
    }
}

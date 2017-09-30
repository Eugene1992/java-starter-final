package hw04;

public class Hw02 {
    public static void main(String[] args) {
        int x = symmetric();
        System.out.println(x);

    }

    static int symmetric() {
        int x, y, a, b, k = 0;
        for (int i = 0; i < 24; i++) {
            x = i / 10;
            y = i % 10;
            for (int j = 0; j < 60; j++) {
                a = j / 10;
                b = j % 10;
                if (x == b && y == a) {
                    k++;
                    if (i < 10 && j >= 10) {
                        System.out.println("0" + i + ":" + j);
                    }
                    if (i < 10 && j < 10) {
                        System.out.println("0" + i + ":0" + j);
                    }
                    if (j < 10 && i >= 10) {
                        System.out.println(+i + ":0" + j);
                    }
                    if (i >= 10 && j >= 10) {
                        System.out.println(+i + ":" + j);
                    }
                }
            }
        }
        return k;

    }
}

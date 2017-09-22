public class Cw02 {
    public static void main(String[] args) {
        int x = 43, n=0;
        int a1, a2, a3, a4, a5, a6;

        while (n < 7) {
            a1 = x % 2;
            System.out.print(a1);
            x = x / 2;
            n++;
        }
    }
}


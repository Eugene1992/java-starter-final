package hw03;

public class T05 {
    public static void main(String[] args) {
        int i = 1, x = 0, y = 1, k = 0;
        while (i < 21) {
            System.out.println(i + ".  " + k);
            k = x + y;
            x = y;
            y = k;
            i++;
        }
    }
}

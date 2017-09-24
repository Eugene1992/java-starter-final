package cw03;

public class BreakTest {
    public static void main(String[] args) {

        for (int a = 10;;a++) {
            if (a == 16) {
                continue;
            }
            System.out.println(a);
            if (a == 25) {
                break;
            }
        }
    }
}

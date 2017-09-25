package cw03;

public class LogicOrTest {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;

        if (a > 10 || b < 50) {
            System.out.println("Yeah!");
        }

        if (a < 0 && b > 50 | b < 0 & b > 50 || a > 0) {
            System.out.println("Yeah!");
        }

    }
}

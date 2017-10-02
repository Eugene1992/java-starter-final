package hw01;

public class First {
    public static void main(String[] argz) {
//1
        byte a;
        short b;
        int c;
        long d;
//2
        byte e = 5 + 10;

        System.out.println("2. e = " + e);
//3
        short e1 = 636 - 353;

        System.out.println("3. e = " + e);
//4
        int i = 56486 / 554;

        System.out.println("4. i = " + i);
//5
        long j = 45675 * 354;

        System.out.println("5. j = " + j);
//6
        byte a6 = 5;
        byte b6 = 74;
        byte c6 = (byte) (a6 + b6);

        System.out.println("6. c = " + c6);
//7
        short a7 = 67;
        short b7 = 867;
        byte g7 = 5;
        byte c7 = (byte) (b7 + a7);
        c7 = (byte) (c7 / g7);

        System.out.println("7. c = " + c7);
//8
        int a8 = (c7 / c6) * (b7 / a7);

        System.out.println("8. a = " + a8);
//9
        int g = 4846;
        int h = 9366;
        int k;

        System.out.println("9. g = " + g + " h = " + h);

        k = h;
        h = g;
        g = k;

        System.out.println(" g = " + g + " h = " + h);
//10
        int x = 47;
        int y = 485;

        System.out.println("10.  x = " + x + " y = " + y);
        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println(" x = " + x + " y = " + y);
    }
}
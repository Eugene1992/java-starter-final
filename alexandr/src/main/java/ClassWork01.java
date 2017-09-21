public class ClassWork01 {
    public static void main(String[] args) {
        int a = 21;
        int b6 = a % 2;
        a = a / 2;
        int b5 = a % 2;
        a = a / 2;
        int b4 = a % 2;
        a = a / 2;
        int b3 = a % 2;
        a = a / 2;
        int b2 = a % 2;
        a = a / 2;
        int b1 = a % 2;
        a = a / 2;
        int b0 = a % 2;
        a = a / 2;

        System.out.print(b0);
        System.out.print(b1);
        System.out.print(b2);
        System.out.print(b3);
        System.out.print(b4);
        System.out.print(b5);
        System.out.print(b6);
        System.out.println();

        int c = 10101;
        int d6 = (c % 10) * 1;
        c = c / 10;
        int d5 = (c % 10) * 2;
        c = c / 10;
        int d4 = (c % 10) * 4;
        c = c / 10;
        int d3 = (c % 10) * 8;
        c = c / 10;
        int d2 = (c % 10) * 16;
        c = c / 10;
        int d1 = (c % 10) * 32;
        c = c / 10;
        int d0 = (c % 10) * 64;
        c = c / 10;
        System.out.println(d0+d1+d2+d3+d4+d5+d6);

    }
}

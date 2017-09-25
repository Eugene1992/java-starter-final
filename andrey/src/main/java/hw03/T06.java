package hw03;

import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, x, y, z, b, d, e, k;
        System.out.print("Enter a number:");
        int a = scan.nextInt();
        System.out.println("Enter 2 to convert to BIN");
        System.out.println("Enter 6 to convert to HEX");
        System.out.println("Enter 8 to convert to OCT");
        int c = scan.nextInt();
        switch (c) {
            case 2: {
                x = a / 2;
                i = a % 2;
                z = x % 2;
                x = x / 2;
                y = x % 2;
                x = x / 2;
                b = x % 2;
                x = x / 2;
                d = x % 2;
                x = x / 2;
                e = x % 2;
                x = x / 2;
                k = x % 2;
                System.out.printf("%d%d%d%d%d%d%d", k, e, d, b, y, z, i);
                break;


            }
            case 6: {
                x = a / 16;
                i = a % 16;
                z = x % 16;
                x = x / 16;
                y = x % 16;
                x = x / 16;
                System.out.printf("%x%x%x%x", x, y, z, i);
                break;
            }
            case 8: {
                x = a / 8;
                i = a % 8;
                z = x % 8;
                x = x / 8;
                y = x % 8;
                x = x / 8;
                b = x % 8;
                x = x / 8;
                d = x % 8;
                System.out.printf("%d%d%d%d%d", d, b, y, z, i);
                break;
            }
        }
    }
}

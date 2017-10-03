//6     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
//      будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
//      либо сообщать, что корней нет.

package hw2;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please print a,b,c:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int disc = discriminant(a, b, c);

        switch (disc) {
            case 0:
                root(disc, a, b);
                break;
            case -1:
                System.out.println("There are no roots here");
                break;
            default:
                roots(disc, a, b);
                break;
        }
    }

    static int discriminant(int a, int b, int c) {
        int discriminant = (int) Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            return -1;
        }
        return discriminant;
    }

    static void root(int discriminant, int a, int b) {
        int root = -b / (2 * a);
        System.out.println("Root is = " + root);
    }

    static void roots(int discriminant, int a, int b) {
        int rootOne = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
        int rootTwo = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
        System.out.println("Root One is = " + rootOne);
        System.out.println("Root Two is = " + rootTwo);
    }
}

package hw03;

import java.util.Scanner;

public class T08 {
    public static void main(String[] args) {
        int x = 1;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scan.nextInt();
        while (x <= i / 2) {
            y = i % x;
            if (y == 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}

package hw03;

import java.util.Scanner;

public class T07 {
    public static void main(String[] args) {
        double x = 1;
        int y = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scan.nextInt();
        while (y <= i) {
            x = x * y;
            y++;
            System.out.println(x);
        }
    }
}

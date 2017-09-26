package hw03;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        /*
        Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scan.nextInt();
        int z = 1;
        System.out.println("Факториал натурального числа n, введенного пользователем.");
        for (int i = 1; i <= n; i++) {
            z = z * i;
        }
        System.out.println(z);

    }
}

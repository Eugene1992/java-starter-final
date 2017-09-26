package hw03;

import java.util.Scanner;

public class DividerTest {
    public static void main(String[] args) {

        /*
        Выведите на экран все положительные делители натурального числа, введенного пользователем.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = scan.nextInt();
        System.out.println("Все положительные делители натурального числа, введенного пользователем.");
        for (int i =1; i <= x; i++) {
            if (x % i == 0 ) {
                System.out.print(i + " ");
            }
        }
    }
}

package hw2;

import java.util.Scanner;

/**
 * Задание 8
 * Используя IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
 * промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
 * Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
 * выводится соответствующее сообщение.
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number what will be >= 0:");
        int newNumber = scanner.nextInt();

        if (newNumber >= 0 && newNumber <= 14) {
            System.out.println("Your number in range [0 - 14]");
        } else if (newNumber >= 15 && newNumber <= 35) {
            System.out.println("Your number in range [0 - 14]");
        } else if (newNumber >= 36 && newNumber <= 50) {
            System.out.println("Your number in range [36 - 50]");
        } else if (newNumber >= 50 && newNumber <= 100) {
            System.out.println("Your number in range [50 - 100]");
        } else {
            System.out.println("Can not find your number in range [0 - 100]. Try again, please.");
        }
    }
}

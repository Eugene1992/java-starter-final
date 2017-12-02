package hw2;

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        first(scan);
        second(scan);
        third(scan);
        fourth(scan);
    }


    static void first(Scanner scan) {
//2     Создать программу, проверяющую и сообщающую на экран,
//      является ли введенное с консоли целое число, чётным либо нечётны
        System.out.println("1.");
        int firstVal = scan.nextInt();
        if (firstVal % 2 == 1) {
            System.out.println("This value is uneven");
        } else {
            System.out.println("This value is even");
        }
    }

    static void second(Scanner scan) {
//3     Создать программу, выводящую на экран ближайшее к
//      10 из двух чисел, введенных с консоли. Например,
//      среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

        System.out.println("2.");
        int firstVal = scan.nextInt();
        int secondVal = scan.nextInt();
        int rangeFirst;
        int rangeSecond;
        rangeFirst = Math.abs(10 - firstVal);
        rangeSecond = Math.abs(10 - secondVal);
        if (rangeFirst > rangeSecond) {
            System.out.println(secondVal + " closer to 10");
        } else {
            System.out.println(firstVal + " closer to 10");
        }
    }

    static void third(Scanner scan) {
//4     Задано три переменных, найти и вывести на экран
//      переменную с максимальным значением
//      (значения всех переменных разные).

        System.out.println("3.");
        int firstVal = 574;
        int secondVal = 24;
        int thirdVal = 486;
        int answer;
        answer = firstVal > secondVal ? firstVal : secondVal;
        answer = answer > thirdVal ? answer : thirdVal;
        System.out.println(answer);
    }

    static void fourth(Scanner scan) {
//5     Задано четыре переменных, найти и вывести
//      на экран вторую по величине.
        System.out.println("4.");
        int[] values = {0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            values[i] = scan.nextInt();
        }
        int iMax = 0;
        int iMin = 0;
        for (int i = 1; i < 4; i++) {
            if (values[iMax] < values[i]) {
                iMax = i;
            }
            if (values[iMin] > values[i]) {
                iMin = i;
            }
        }
        values[iMax] = values[iMin];
        for (int i = 1; i < 4; i++) {
            if (values[iMax] < values[i]) {
                iMax = i;
            }
        }
        System.out.println("This number - " + values[iMax]);
    }
}

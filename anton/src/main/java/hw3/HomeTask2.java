package hw3;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        int n = 10000;
        int firstValue = 1000;

//1     Создайте программу, выводящую на экран все четырёхзначные
//      числа последовательности 1000 1003 1006 1009 1012 1015 ….

        System.out.println("1 Task");

        for (int i = 0; i < n; i++) {
            firstValue += 3;
            if (firstValue >= 10000) {
                break;
            }
            System.out.print(firstValue + " ");
        }

//2     Создайте программу, выводящую на экран первые 55
//      элементов последовательности 1 3 5 7 9 11 13 15 17 ….


        System.out.println("");
        System.out.println("2 Task");

        n = 55;
        firstValue = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(firstValue + " ");
            firstValue += 2;
        }

//3     Создайте программу, выводящую на экран первые 55
//      элементов последовательности 1 3 5 7 9 11 13 15 17 ….

        System.out.println("");
        System.out.println("3 Task");

        n = 100;
        firstValue = 90;
        for (int i = 0; i < n; i++) {
            System.out.print(firstValue + " ");
            firstValue -= 5;
            if (firstValue < 0) {
                break;
            }
        }

//4     Создайте программу, выводящую на экран первые 20
//      элементов последовательности 2 4 8 16 32 64 128 ….

        System.out.println("");
        System.out.println("4 Task");

        n = 20;
        firstValue = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(firstValue + " ");
            firstValue *= 2;
        }

//5     Выведите на экран первые 20 членов последовательности
//      Фибоначчи.

        System.out.println("");
        System.out.println("5 Task");

        n = 18;
        int secondValue = 0;
        int thirdValue = 1;
        System.out.print(secondValue + " ");
        System.out.print(thirdValue + " ");
        for (int i = 0; i < n; i++) {
            firstValue = secondValue + thirdValue;
            System.out.print(firstValue + " ");
            secondValue = thirdValue;
            thirdValue = firstValue;
        }

//7     Создайте программу, вычисляющую факториал
//      натурального числа n, введенного пользователем.

        System.out.println("");
        System.out.println("7 Task");

        Scanner scan = new Scanner(System.in);

        firstValue = scan.nextInt();
        n = 1;
        if (firstValue == 0) {
            System.out.println(n);
        } else {
            for (int i = 1; i < firstValue + 1; i++) {
                n *= i;
                System.out.print(n + " ");
            }
        }

//8     Выведите на экран все положительные делители
//      натурального числа, введенного пользователем.

        System.out.println("");
        System.out.println("8 Task");

        firstValue = scan.nextInt();

        if (firstValue <= 0) {
            System.out.println("Invalid value");
        } else {
            for (int i = 1; i < firstValue + 1; i++) {
                if (firstValue % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}

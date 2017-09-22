package hw02;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        /*Задание 1
        Выучите основные конструкции и понятия, рассмотренные на уроке.
        Внимательно прочитайте эти статьи:
        http://www.znannya.org/?view=Java_DataTypes
        http://www.znannya.org/?view=Java_PrimitiveTypes
        http://www.znannya.org/?view=Java_PrimitiveTypesOp

        --------------------- Intro ---------------------

        Для получения информации с консоли нужно создать обьект типа Scanner:

        Scanner scan = new Scanner(System.in);

        Затем строку получаем следующим образом:
        String s = scan.next();

        Целочисленное значение:
        int i = scan.nextInt();

        Если нужно получить более одной строки или одного числа - просто дублируем scan.nextInt()
        или scan.next(), и записываем в разные переменные. Например:

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        */

        /*Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётны
        */

        System.out.println("Enter number from keyboard");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x % 2 == 1) {
            System.out.println("Number isn't paired");
        } else {
            System.out.println("Number is paired");
        }

        /*
        Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        */

        System.out.println("Enter number from keyboard");
        int g = scan.nextInt();
        System.out.println("Enter number from keyboard");
        int h = scan.nextInt();
        if ( Math.abs(g - 10) > Math.abs(h - 10) ) {
            System.out.println("This number is closer to 10" + h);
        } else if (Math.abs(g - 10) < Math.abs(h - 10)) {
            System.out.println("This number is closer to 10" + g);
        } else {
            System.out.println("Two number's are equal");
        }

        /*
        Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).
        */

        int k = 15;
        int l = 23;
        int m = 8;
        if ( (k > m) && (k > l) ) {
            System.out.println("This number is bigger" + k);
        } else if ((l > m) && (l > k)) {
            System.out.println("This number is bigger" + l);
        } else {
            System.out.println("This number is bigger" + m);
        }

        /*
        Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине.
        */

        int a1 = 19;
        int a2 = 3;
        int a3 = 22;
        int a4 = 9;
        int max;
        if ( ((a1 > a2) && (a1 > a3)) || ((a1 > a2) && (a1 > a4)) || ((a1 > a3) && (a1 > a4)) ) {
            max = a1;
        } else if ( ((a2 > a1) && (a2 > a3)) || ((a2 > a1) && (a2 > a4)) || ((a2 > a3) && (a2 > a4)) ) {
            max = a2;
        } else if ( ((a3 > a1) && (a3 > a2)) || ((a3 > a1) && (a3 > a4)) || ((a3 > a2) && (a3 > a4)) ) {
            max = a3;
        } else {
            max = a4;
        }
        System.out.println(max);

        /*
        Задание 6
        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        либо сообщать, что корней нет.
        */

        double a = 3;
        double b = 5;
        double c = 7;
        double d = b * b - 4*a*c;
        if (d >= 0) {
            double x1 = (-b + Math.sqrt(d))/2*a;
            double x2 = (-b - Math.sqrt(d))/2*a;
            System.out.print("Solution's :" + x1);
            System.out.println("," + x2);
        } else {
            System.out.println("No solution's");
        }

    }
}

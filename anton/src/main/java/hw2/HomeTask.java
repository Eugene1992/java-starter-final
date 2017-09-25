package hw2; // TODO: 24.09.2017  

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//2     Создать программу, проверяющую и сообщающую на экран,
//      является ли введенное с консоли целое число, чётным либо нечётны

        System.out.println("2.");
        int firstVal = scan.nextInt();
        if (firstVal % 2 == 1) {
            System.out.println("This value is uneven");
        } else {
            System.out.println("This value is even");
        }

//3     Создать программу, выводящую на экран ближайшее к
//      10 из двух чисел, введенных с консоли. Например,
//      среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.



//4     Задано три переменных, найти и вывести на экран
//      переменную с максимальным значением
//      (значения всех переменных разные).

        System.out.println("4.");
        int fourthVal = 574;
        int fifthsVal = 24;
        int sixthVal = 486;
        int answer;
        answer = fourthVal > fifthsVal ? fifthsVal : fourthVal;
        answer = answer > sixthVal ? sixthVal : answer;
        System.out.println(answer);

//5     Задано четыре переменных, найти и вывести
//      на экран вторую по величине.



//6     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
//      будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
//      либо сообщать, что корней нет.










    }
}

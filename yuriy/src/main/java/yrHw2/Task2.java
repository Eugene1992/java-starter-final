package yrHw2;

import java.util.Scanner;

/**
 * Задание 2
 * Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 * консоли целое число, чётным либо нечётны
 */

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number: ");
        int valueFromConsoleOne = scanner.nextInt();

        if ((valueFromConsoleOne % 2) > 0) {
            System.out.println("Value is not even");
        } else {
            System.out.println("Value is even");

        }
    }
}

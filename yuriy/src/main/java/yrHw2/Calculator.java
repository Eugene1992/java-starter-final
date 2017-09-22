package yrHw2;

import java.util.Scanner;

/**
 * * Задание 7
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Напишите программу - консольный калькулятор.
 * Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 * Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 * Выведите на экран результат выполнения арифметической операции.
 * В случае использования операции деления, организуйте проверку попытки деления на ноль.
 * И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 * пользователя.
 * <p>
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        int enteredValueOne = scanner.nextInt();
        System.out.println("Please, enter second number: ");
        int enteredValueTwo = scanner.nextInt();
        System.out.println("Enter operator, please: ");
        String enteredOperator = scanner.next();

        switch (enteredOperator) {
            case "+":
                System.out.println(enteredValueOne + enteredValueTwo);
                break;
            case "-":
                System.out.println(enteredValueOne - enteredValueTwo);
                break;
            case "/":
                if (enteredValueOne == 0 || enteredValueTwo == 0) {
                    System.out.println("You can't divide by 0!!!");
                    break;
                } else {
                    System.out.println(enteredValueOne / enteredValueTwo);
                }
                break;
            case "*":
                System.out.println(enteredValueOne * enteredValueTwo);
                break;
            default:
                System.out.println("Please, try again later.");
        }
    }
}

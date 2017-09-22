package hw02;

import java.util.Scanner;

public class Calcul {

    public static void main(String[] args) {

        /*
        Задание 7
        Используя IntelliJ IDEA, создайте класс Calculator.
        Напишите программу - консольный калькулятор.
        Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
        Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
        Выведите на экран результат выполнения арифметической операции.
        В случае использования операции деления, организуйте проверку попытки деления на ноль.
        И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
        пользователя.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scan.nextInt();
        System.out.println("Enter arifmetic action( +, -, *, /, % )");
        String actionCalc = scan.next();
        System.out.println("Enter second number");
        int y = scan.nextInt();
        switch (actionCalc) {
            case "+" :
                System.out.println("Sum: " + (x + y) );
                break;
            case "-" :
                System.out.println("Dif: " + (x - y) );
                break;
            case "*" :
                System.out.println("Mult: " + (x * y) );
                break;
            case "/" :
                if (y == 0) {
                    System.out.println("Division by zero");
                } else {
                    System.out.println("Div: " + (x / y) );
                }
                break;
            case "%" :
                System.out.println("%%%: " + (x % y) );
                break;
        }

    }
}

/*      Используя IntelliJ IDEA, создайте класс Calculator.
        Напишите программу - консольный калькулятор.
        Введите с консоли две переменные. Предложите
        пользователю ввести знак арифметической операции.
        Для организации выбора алгоритма вычислительного
        процесса, используйте оператор switch. Выведите на
        экран результат выполнения арифметической операции.
        В случае использования операции деления, организуйте
        проверку попытки деления на ноль. И если таковая имеется,
        то отмените выполнение арифметической операции и уведомите
        об ошибке пользователя
*/

package hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Print first operand:");
        int firstOperand = scan.nextInt();

        System.out.println("Print second operand:");
        int secondOperand = scan.nextInt();

        System.out.println("Print operant:");
        String operantS = scan.next();
        char operant = operantS.charAt(0);

        System.out.println("Result is");

        switch (operant) {
            case '+':
                firstOperand = firstOperand + secondOperand;
                System.out.println(firstOperand);
                break;
            case '-':
                firstOperand = firstOperand - secondOperand;
                System.out.println(firstOperand);
                break;
            case '*':
                firstOperand = firstOperand * secondOperand;
                System.out.println(firstOperand);
                break;
            case '/':
                if (secondOperand == 0) {
                    System.out.println("Wrong secon operand");
                } else {
                    firstOperand = firstOperand / secondOperand;
                    System.out.println(firstOperand);
                }
                break;
            case '%':
                firstOperand = firstOperand % secondOperand;
                System.out.println(firstOperand);
                break;
        }
    }
}

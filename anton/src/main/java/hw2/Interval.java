/*
        Используя IntelliJ IDEA, создайте класс Interval.
        Напишите программу определения, попадает ли
        введенное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100].
        Если да, то укажите, в какой именно промежуток.
        Если пользователь указывает число не входящее ни в
        один из имеющихся числовых промежутков, то выводится
        соответствующее сообщение.
*/

package hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();

        if (value <= 0 || value >= 100) {
            System.out.println("Wrong number");
        }
        if (value >= 0 && value <= 14) {
            System.out.println("Diapasone is [0 - 14]");
        }
        if (value >= 15 && value <= 35) {
            System.out.println("Diapasone is [15 - 35]");
        }
        if (value >= 36 && value <= 50) {
            System.out.println("Diapasone is [36 - 50]");
        }
        if (value >=     51 && value <= 100) {
            System.out.println("Diapasone is [51 - 100]");
        }
    }
}
package hw03;

import java.util.Scanner;

public class ConvertNumber {
    public static void main(String[] args) {

        /*Написать программу, которая реализует следующий функционал:
        6.1 Пользователь вводит число в 10-ой системе счисления.
        6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
            в 2-ую
            в 8-ую
            в 16-ую
        6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
        на экран результат.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = scan.nextInt();
        System.out.println("Choose numeric system for converting:");
        System.out.println("2");
        System.out.println("8");
        System.out.println("16");
        int y = scan.nextInt();
        String s = "";

        System.out.println("Converting result:");
        if (y == 2 || y == 8) {
            while (x != 0) {
                s = x % y + s;
                x = x / y;
            }
        }

        if (y == 16) {

            while (x != 0) {
                switch (x % y) {
                    case 10:
                        s = "A" + s;
                        x = x / y;
                        break;
                    case 11:
                        s = "B" + s;
                        x = x / y;
                        break;
                    case 12:
                        s = "C" + s;
                        x = x / y;
                        break;
                    case 13:
                        s = "D" + s;
                        x = x / y;
                        break;
                    case 14:
                        s = "E" + s;
                        x = x / y;
                        break;
                    case 15:
                        s = "F" + s;
                        x = x / y;
                        break;
                    default:
                        s = x % y + s;
                        x = x / y;
                }
            }
        }
        System.out.println(s);
    }
}

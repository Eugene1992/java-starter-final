package hw02;

import java.util.Scanner;

public class Interv {
    public static void main(String[] args) {

        /*
        Задание 8
        Используя IntelliJ IDEA, создайте класс Interval.
        Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
        Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
        выводится соответствующее сообщение.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number from 0 to 100");
        int x = scan.nextInt();
        if ( (x >= 0) && (x <= 14) ){
            System.out.println("number from 0 to 14");
        } else if ( (x >=15) && (x <= 35) ){
            System.out.println("number from 15 to 35");
        }  else if ( (x >= 36) && (x <= 50) ){
            System.out.println("number from 36 to 50");
        } else if ( (x >= 51) && (x <= 100) ){
            System.out.println("number from 50 to 100");
        } else {
            System.out.println("Out of 1 .. 100");
        }
    }
}

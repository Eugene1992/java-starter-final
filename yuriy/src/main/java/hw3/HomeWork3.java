package hw3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args){

        System.out.println("1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….");
        for(int i = 1000; i <= 9999; i += 3){
            System.out.println(i);
        }

        System.out.println("2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….");
        for(int a = 1; a <= 55; a++){
            System.out.println(a);
        }

        System.out.println("3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….");
        for(int b = 90; b >= 0; b -= 5){
            System.out.println(b);
        }

        System.out.println("4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….");
        int valueHw3Task4 = 2;
        System.out.println(valueHw3Task4);

        for(int c = 0; c <= 20; c++){
            valueHw3Task4 = valueHw3Task4 * 2;
            System.out.println(valueHw3Task4);
        }

        System.out.println("5. Выведите на экран первые 20 членов последовательности Фибоначчи.");
        int fibonacciNumberCount = 20;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println(previousNumber);
        System.out.println(nextNumber);

        for(int i = 2; i < fibonacciNumberCount; i++){
            int fibonacciNumber = previousNumber + nextNumber;

            System.out.println(fibonacciNumber);

            previousNumber = nextNumber;
            nextNumber = fibonacciNumber;
        }

        /**
         *6. Написать программу, которая реализует следующий функционал:
         6.1 Пользователь вводит число в 10-ой системе счисления.
         6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
         в 2-ую
         в 8-ую
         в 16-ую
         6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
         на экран результат.
         */

        System.out.println("6. Написать программу, которая реализует следующий функционал:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number (example: '2', '345', '45')");
        int userInput = scanner.nextInt();
        int value45 = 100200;

        System.out.println("Enter number '2', '8' or '16'");
        int number2or8or16 = scanner.nextInt();

//        while(value45 != 0){
            switch(number2or8or16){
                case 2:
//                    String fromIntToBinary = Integer.toBinaryString(userInput);
//                    System.out.println(fromIntToBinary);
                    String binaryNumber = "";
                    while (userInput > 0) {
                        int rem = userInput % 2;
                        binaryNumber = rem + binaryNumber;
                        userInput = userInput / 2;
                    }

                    System.out.println(binaryNumber);
                    break;
                case 8:
                    String fromIntToOctogonal = Integer.toOctalString(userInput);
                    System.out.println(fromIntToOctogonal);

                    break;
                case 16:
                    String fromIntToHexaggonal = Integer.toHexString(userInput).toUpperCase();
                    System.out.println(fromIntToHexaggonal);

//                    String digits = "0123456789ABCDEF";
//                    String hexagonalNumber = "";
//
//                    while (userInput > 0) {
//                        int digit = userInput % 16;
//                        hexagonalNumber = digits.charAt(digit) + hexagonalNumber;
//                        userInput = userInput / 16;
//                    }
                    break;
                default:
                    System.out.println("Please, enter a numbeber");
            }

        if (userInput == 0) {
            System.out.println("Sorry, you enter 0.");
        }
//        }

        /**
         * 7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
         Выведите на экран все положительные делители натурального числа, введенного пользователем.
         */
        System.out.println("Enter decimal number (example: '1', '345', '45')");
        long userInput7 = scanner.nextLong();
        long n = 1;

        if(userInput7 < 0){
            System.out.println("Number can not be 0.");
        } else {
            for (long i = 1; i <= userInput7; i++){
                n *= i;
            }
            System.out.println(n);
        }

    }
}

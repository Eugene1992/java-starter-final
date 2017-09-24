package hw3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int n = 10000;
        int firstValue = 1000;

//1

        System.out.println("1 Task");

        for (int i = 0; i < n; i++) {
            firstValue += 3;
            if (firstValue >= 10000) {
                break;
            }
            System.out.print(firstValue + " ");
        }

//2


        System.out.println("");
        System.out.println("2 Task");

        n = 55;
        firstValue = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(firstValue + " ");
            firstValue += 2;
        }

//3

        System.out.println("");
        System.out.println("3 Task");

        n = 100;
        firstValue = 90;
        for (int i = 0; i < n; i++) {
            System.out.print(firstValue + " ");
            firstValue -= 5;
            if (firstValue < 0) {
                break;
            }
        }

//4

        System.out.println("");
        System.out.println("4 Task");

        n = 20;
        firstValue = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(firstValue + " ");
            firstValue *= 2;
        }

//5

        System.out.println("");
        System.out.println("5 Task");

        n = 18;
        int secondValue = 0;
        int thirdValue = 1;
        System.out.print(secondValue + " ");
        System.out.print(thirdValue + " ");
        for (int i = 0; i < n; i++) {
            firstValue = secondValue + thirdValue;
            System.out.print(firstValue + " ");
            secondValue = thirdValue;
            thirdValue = firstValue;
        }

//7

        System.out.println("");
        System.out.println("7 Task");

        Scanner scan = new Scanner(System.in);

        firstValue = scan.nextInt();
        n = 1;
        if (firstValue == 0) {
            System.out.println(n);
        } else {
            for (int i = 1; i < firstValue + 1; i++) {
                n *= i;
                System.out.print(n + " ");
            }
        }

//8

        System.out.println("");
        System.out.println("8 Task");

        firstValue = scan.nextInt();
//        n = 1;
        if (firstValue <= 0) {
            System.out.println("Invalid value");
        } else {
            for (int i = 1; i < firstValue + 1; i++) {
//                n *= i;
                if (firstValue%i==0)
                {
                    System.out.print(i + " ");
                }
            }
        }

    }
}

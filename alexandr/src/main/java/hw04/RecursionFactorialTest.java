package hw04;

import java.util.Scanner;

public class RecursionFactorialTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for calculating factorial");
        int factorialNumber = scan.nextInt();
        System.out.println(factorialOfNumber(factorialNumber));
    }

    static int factorialOfNumber (int number){
        if (number <= 1) return 1;
        return number*factorialOfNumber(number-1);
    }
}

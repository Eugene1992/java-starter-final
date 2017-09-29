package hw04;

import java.util.Scanner;

//      Unlucky numbers

public class Hw01 {
    public static void main(String[] args) {
        int x = 6;
        System.out.println("The sum of tickets with number 13 is " + calc(x));
        print(x);

    }

    //calculation sum numbers
    static double calc(int a) {
        double sum = (a - 1) * Math.pow(10, (a - 2));
        return sum;
    }

    //Printing result
    static void print(int b) {
        if (b==1){
            System.out.println("Unlucky ticket does not exist ");
            return;
        }
        if (b>2) {
            for (int i = 0; i < Math.pow(10, (b - 2)); i++) {
                System.out.println("13" + i);
            }
            for (int i = 0; i < Math.pow(10, (b - 2)); i++) {
                System.out.println(+i + "13");
            }
        }
        else {
            System.out.println(13);
        }
    }
}

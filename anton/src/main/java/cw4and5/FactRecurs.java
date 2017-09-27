package cw4and5;

import java.util.Scanner;

public class FactRecurs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fact(n, 1));
    }

    static int fact(int n, int result) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1, result);
    }
}

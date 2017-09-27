package cw4and5;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please print begin of interval");
        int begin = scan.nextInt();
        System.out.println("Please print begin of interval");
        int end = scan.nextInt();

        int result = sum(begin, end);
        System.out.println(result);
    }

    static int sum(int begin, int end) {
        int result = 0;
        for (int i = begin; i < end + 1; i++) {
            result += i;
        }
        return result;
    }
}

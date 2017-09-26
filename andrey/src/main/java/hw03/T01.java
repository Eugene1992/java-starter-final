package hw03;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        int y = 1000;
        System.out.println("enter the number of sequence numbers:");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        while (i > 0) {
            System.out.println(y);
            y = y + 3;
            i--;
        }


    }

}

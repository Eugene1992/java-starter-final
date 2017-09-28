package cw04;

import java.util.Scanner;

public class Cw03 {
    public static void main(String[] args) {
        String s = " ";
        Scanner scan = new Scanner(System.in);
        int x=7;
        int y=2;
        for (int i = 0; i < 10; i++) {
            s = x % y + s;
            System.out.println(s);
            x=x/y;


        }
        s=null;
        System.out.println(s);
    }
}

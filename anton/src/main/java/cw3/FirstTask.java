package cw3;

import java.util.Scanner;


public class FirstTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = 100;
        byte roz;
        int quadro = 4;

        String s = "";

        for (int i = 1; i < n + 1; i++) {
            roz = (byte) (a % 2);
            s = roz + s;
            a = a / 2;
//            System.out.print(roz);
            quadro--;
            if (quadro == 0) {
//                System.out.print(" ");
                s = " " + s;
                quadro = 4;
            }

        }
        System.out.println(s);
    }
}

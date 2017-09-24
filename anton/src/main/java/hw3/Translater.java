package hw3;

import java.util.Scanner;

public class Translater {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, print your number, please:");
        String key;

        int firstValue = scan.nextInt();

        System.out.println("Please, choose new scale of notation:");
        System.out.println("1 - dual; 2 - eight; 3 - sixteen.");
        int j = scan.nextInt();

        String s = "";
        int n = 40;
        byte roz;
        int val = 2;
        int quadro = 4;

        switch (j) {
            case 1:

                for (int i = 1; i < n + 1; i++) {
                    roz = (byte) (firstValue % 2);
                    s = roz + s;
                    firstValue = firstValue / 2;
                    quadro--;
                    if (quadro == 0) {
                        s = " " + s;
                        quadro = 4;
                    }
                }
                System.out.println(s);
                break;
            case 2:

                for (int i = 1; i < n + 1; i++) {
                    roz = (byte) (firstValue % 8);
                    s = roz + s;
                    firstValue = firstValue / 8;
                    quadro--;
                    if (quadro == 0) {
                        s = " " + s;
                        quadro = 4;
                    }
                }
                System.out.println(s);
                break;

            case 3:

                System.out.print("0x");

                for (int i = 1; i < n + 1; i++) {
                    roz = (byte) (firstValue % 16);

                    switch (roz) {
                        case 10:
                            s = "A" + s;
                            break;
                        case 11:
                            s = "B" + s;
                            break;
                        case 12:
                            s = "C" + s;
                            break;
                        case 13:
                            s = "D" + s;
                            break;
                        case 14:
                            s = "E" + s;
                            break;
                        case 15:
                            s = "F" + s;
                            break;
                        default:
                            s = roz + s;
                            break;
                    }
                    firstValue = firstValue / 16;
                    quadro--;
                    if (quadro == 0) {
                        s = " " + s;
                        quadro = 4;
                    }
                }
                System.out.println(s);
                break;
        }
    }
}

package cw2;

public class Translate {
    public static void main(String[] argz) {
        int a = 127;
        byte roz1, roz2, roz3, roz4, roz5, roz6, roz7;

        roz1 = (byte) (a % 2);
        a = a / 2;
        roz2 = (byte) (a % 2);
        a = a / 2;
        roz3 = (byte) (a % 2);
        a = a / 2;
        roz4 = (byte) (a % 2);
        a = a / 2;
        roz5 = (byte) (a % 2);
        a = a / 2;
        roz6 = (byte) (a % 2);
        a = a / 2;
        roz7 = (byte) (a % 2);

        System.out.println(" " + roz1 + " " + roz2 + " " + roz3 + " " + roz4 + " " + roz5 + " " + roz6 + " " + roz7);

        int b = 1111111;
        byte rez = 0;

        rez += (byte) ((b % 10) * 1);
        b = b / 10;

        rez += (byte) ((b % 10) * 2);
        b = b / 10;

        rez += (byte) ((b % 10) * 4);
        b = b / 10;

        rez += (byte) ((b % 10) * 8);
        b = b / 10;

        rez += (byte) ((b % 10) * 16);
        b = b / 10;

        rez += (byte) ((b % 10) * 32);
        b = b / 10;

        rez += (byte) ((b % 10) * 64);
        b = b / 10;

        System.out.println(rez);

        rez = 0;
        b = 1111111;
        int i;
        for (i = 0; i < 7; i++) {
            rez += (byte) ((b % 10) * (2 ^ i));
            b = b / 10;
        }
        System.out.println(rez);
    }
}

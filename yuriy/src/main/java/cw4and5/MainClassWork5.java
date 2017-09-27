package cw4and5;

public class MainClassWork5 {
    private static int[] arrayTr = {2, 3, 5, 6, 7, 8};

    public static void main(String[] args) {
        calcsummofelementsinarray(arrayTr);
    }

    static void calcsummofelementsinarray(int[] arrayTr) {
        int number = 0;
        for (int i = 0; i < arrayTr.length; i++) {
            number += arrayTr[i];
        }
        System.out.println(number);
    }
}

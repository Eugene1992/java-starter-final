package cw4;

import java.util.Random;

public class MainClassWork5 {
    private static int[] arrayTr = {2, 3, 5, 6, 7, 8};
//    private static int[] array2 = 


    public static void main(String[] args) {
        // 5.1
//        calcsummofelementsinarray(arrayTr);

        // 5.2
//        calcmaxvalueinarray(arrayTr);

        // 5.3

        // 5.4

    }

    // 5.1
    static void calcsummofelementsinarray(int[] arrayTr) {
        int number = 0;
        for (int i = 0; i < arrayTr.length; i++) {
            number += arrayTr[i];
        }
        System.out.println(number);
    }

    //5.2
    static int calcmaxvalueinarray(int[] arrayTr) {
        int maxValue = 0;

        for (int i = 0; i < arrayTr.length; i++) {
//            arrayTr[i];
            if (maxValue < arrayTr[i]) {
                maxValue = arrayTr[i];
            }
        }
        return maxValue;
    }

    //5.3 Вывести в консоль половину массива, среднеарифметическое которых является большим

    //5.4
    private static void calcaLenthOfOutOfElementsInArray(){
        Random random = new Random();
        double[][] array2 = new double[4][5];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt();


            }
        }
        System.out.println(array2);



    }
}

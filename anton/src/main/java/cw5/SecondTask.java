package cw5;

import java.util.Random;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please print [n][m]:");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] array = new int[n][m];
//        int[][] arr ={
//                {1,1,1,1},
//                {1,2,3,1},
//                {1,1,1,1},
//        };

        Random randGen = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randGen.nextInt();
            }
        }

        printArray(array);
        System.out.println(sum(array));

    }


//    static int[][] createArray(int[][] array) {
//        Random randGen = new Random();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = randGen.nextInt();
//            }
//        }
//        return array[][];
//    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sum(int[][] array) {
        int step;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && i != array.length - 1) {
                step = array[i].length - 1;
            } else {
                step = 1;
            }
            for (int j = 0; j < array[i].length;) {
                sum+=array[i][j];
                j+=step;
            }
        }
        return sum;
    }

}

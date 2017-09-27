package cw5;

//import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {

        int[] array = {11, 2, 84, 4, 154, 6, 10, 3};

        System.out.println(sumArray(array));
        System.out.println(maxOfArray(array));
        biggerHalfOfArray(array);

    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static void biggerHalfOfArray(int[] array) {
        int max1 = 0;
        int max2 = 0;
        String s = "";
        for (int i = 0; i < array.length / 2; i++) {
            max1 += array[i];
            max2 += array[i + array.length / 2];
        }
        if (max1 / (array.length / 2) > max2 / (array.length / 2)) {
            for (int i = array.length / 2 - 1; i >= 0; i--) {
                System.out.print(s + array[i] + " ");
            }
        } else {
            for (int i = array.length - 1; i >= array.length / 2; i--) {
                System.out.print(s + array[i] + " ");
            }
        }
    }

//    static int coponateArray(int[] array)
//    {
//        Random randGen= new Random();
//        for (int i = 0; i < array.length; i++) {
//             array[i]= randGen.nextInt();
//        }
//        return array[];
//    }
}

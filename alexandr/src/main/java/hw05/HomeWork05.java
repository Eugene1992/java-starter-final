package hw05;

import java.util.Random;

public class HomeWork05 {
    public static void main(String[] args) {
        int[] testArray1 = new int[10];
        int[] testArray2 = {1,1,2,3,4,5,5,7,7,7,8,9};
//        testArray1 = generateMassive1(testArray1.length);
//        System.out.println("Test Massive:");
//        outPutMassive(testArray1);
//        System.out.println("Even Elements of Massive:");
//        evenNumbersOfMassive(testArray1);
//        System.out.println("Reverse Massive");
//        outPutReverseMassive(testArray1);
//        System.out.println("First and Second Half of Massive");
//        outPutFirstHalfMassive(testArray1);
//        outPutSecondHalfMassive(testArray1);
//        System.out.println("First and Second Reverse Half of Massive");
//        outPutFirstHalfMassiveReverse(testArray1);
//        outPutSecondHalfMassiveReverse(testArray1);
//        System.out.println("Sum of Massive Elements: " + sumOfArrayElements(testArray1));
//        System.out.println("Average Sum of Massive Elements: " + averageSumOfMassiveElements(testArray1));
//        System.out.println("Max Element of Massive: " + maxElementOfMassive(testArray1));
//        System.out.println("Min Element of Massive: " + minElementOfMassive(testArray1));
//        System.out.println("Switch Negative Elements of Massive to 0:");
//        replaceNegativeElementsOfMassive(testArray1);
//        outPutMassive(testArray1);
//        System.out.println("Switch places Max and Min Elements of Massive:");
//        switchMaxAndMinElementOfMassive(testArray1);
        System.out.println("Count Same Elements of Massive:");
        outPutMassive(testArray2);
        System.out.println(countSameElementsOfMassive(testArray2));
    }

    static int[] generateMassive1(int massiveLength) {
        int[] array = new int[massiveLength];
        Random randomGenerator = new Random();
        for (int i = 0; i < massiveLength; i++) {
            int randomInt = randomGenerator.nextInt(200) - 100;
            array[i] = randomInt;
        }
        return array;
    }

    static void outPutMassive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    /*
    Вывести в консоль все парные числа одномерного массива.
    */

    static void evenNumbersOfMassive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    /*
    Вывести все числа одномерного массива в обратном порядке.
    */

    static void outPutReverseMassive(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    Вывести первую и вторую половину одномерного массива.
    */

    static void outPutFirstHalfMassive(int[] array) {
        if (array.length % 2 == 1) {
            for (int i = 0; i < array.length / 2 + 1; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = 0; i < array.length / 2; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }


    static void outPutSecondHalfMassive(int[] array) {
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    Вывести первую и вторую половину одномерного массива в обратном порядке.
    */

    static void outPutFirstHalfMassiveReverse(int[] array) {
        if (array.length % 2 == 1) {
            for (int i = array.length / 2; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = array.length / 2 - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }


    static void outPutSecondHalfMassiveReverse(int[] array) {

        for (int i = array.length - 1; i >= array.length / 2; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    Найти сумму всех элементов в массиве.
    */

    static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /*
    Найти среднеарифметическое всех чисел массива.
    */

    static int averageSumOfMassiveElements(int[] array) {
        return sumOfArrayElements(array) / array.length;
    }

    /*
    Найти минимальное и максимальное число в массиве.
    */

    static int minElementOfMassive(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int maxElementOfMassive(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /*
    Заменить все отрицательные числа в массиве на 0.
    */

    static int[] replaceNegativeElementsOfMassive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    /*
    Подсчитать одинаковые числа в одномерном массиве.
    */

    static int countSameElementsOfMassive(int[] array) {
        int k = 0;
        int change;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    change = array[j];
                    array[j] = array[i];
                    array[i] = change;
                }
            }
        }
        change = array[0];
        for (int i = 1; i < array.length; i++) {
            if (change == array [i]) {
                ++k;
            } else {
                change = array[i];
            }
        }
        return k;
    }

    /*
    Поменять минимальное и максимальное числа в массиве местами.
    */

    static int[] switchMaxAndMinElementOfMassive(int[] array) {
        int maxElement = maxElementOfMassive(array);
        int minElement = minElementOfMassive(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxElement) {
                array[i] = minElement;
            } else if (array[i] == minElement) {
                array[i] = maxElement;
            }
        }
        return array;
    }

    /*
    Инвертировать массив.
    */

    static int revertingMassive(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return k;
    }

    /*
    Вывести в консоль половину массива, среднеарифметическое которых является большим.
    */

    /*
    Найти сумму отрицательных чисел в одномерном массиве.
    */

    /*
    Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
    */

    /*
    Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
    */

    /*
    Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
    */

    /*
    Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
    */

    /*
    Вывести в консоль половину массива в которой находиться наименьшее число массива.
    */

    /*
    Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
    */
}

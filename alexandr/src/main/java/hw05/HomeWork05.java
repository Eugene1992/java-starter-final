package hw05;

import java.util.Random;

public class HomeWork05 {
    public static void main(String[] args) {
        int[] testArray1 = new int[10];
        int[] testArray2 = {1, 1, 2, 3, 4, 5, 0, 1, 5, 7, 7, 7, 8, 9, 9};
        /*
        Просто вывод
        */
        testArray1 = generateMassive1(testArray1.length);
        System.out.println("Test Massive:");
        outPutMassive(testArray1);
        System.out.println("Even Elements of Massive:");
        evenNumbersOfMassive(testArray1);
        System.out.println("Reverse Massive");
        outPutReverseMassive(testArray1);
        System.out.println("First and Second Half of Massive");
        outPutFirstHalfMassive(testArray1);
        outPutSecondHalfMassive(testArray1);
        System.out.println("First and Second Reverse Half of Massive");
        outPutFirstHalfMassiveReverse(testArray1);
        outPutSecondHalfMassiveReverse(testArray1);
        System.out.println("Sum of Massive Elements: " + sumOfArrayElements(testArray1));
        System.out.println("Average Sum of Massive Elements: " + averageSumOfMassiveElements(testArray1));
        System.out.println("Max Element of Massive: " + maxElementOfMassive(testArray1));
        System.out.println("Min Element of Massive: " + minElementOfMassive(testArray1));
        System.out.println("Вывести в консоль половину массива, среднеарифметическое которых является большим:");
        maxHalfSum(testArray1);
        System.out.println("Sum of Negative Elements of Massive:");
        testArray1 = generateMassive1(testArray1.length);
        outPutMassive(testArray1);
        System.out.println(sumOfNegativeElementsOfMassive(testArray1));
        System.out.println("Elements of Massive before Element 0:");
        outPutMassive(testArray2);
        elementsBeforeZero(testArray2);
        System.out.println("Elements of Massive before Min Element:");
        testArray1 = generateMassive1(testArray1.length);
        outPutMassive(testArray1);
        elementsBeforeMinEelement(testArray1);
        System.out.println("Sum of Massive Elements between Min and Max Element:");
        testArray1 = generateMassive1(testArray1.length);
        outPutMassive(testArray1);
        System.out.println(sumOfElementsOfMassiveBetweenMaxAndMin(testArray1));
//        System.out.println("Count Same Elements of Massive:");
//        outPutMassive(testArray2);
//        System.out.println(countSameElementsOfMassive(testArray2));
        /*
        Массив изменяется
        */
        System.out.println("Switch Negative Elements of Massive to 0:");
        testArray1 = generateMassive1(testArray1.length);
        outPutMassive(testArray1);
        replaceNegativeElementsOfMassive(testArray1);
        outPutMassive(testArray1);
        System.out.println("Switch places Max and Min Elements of Massive:");
        testArray1 = generateMassive1(testArray1.length);
        outPutMassive(testArray1);
        switchMaxAndMinElementOfMassive(testArray1);
        outPutMassive(testArray1);
        System.out.println("Reversing Massive:");
        testArray1 = generateMassive1(testArray1.length);
        outPutMassive(testArray1);
        revertingMassive(testArray1);
        outPutMassive(testArray1);
        System.out.println("Switch Max Elements With First And Last:");
        testArray1 = generateMassive1(testArray1.length);
        outPutMassive(testArray1);
        switchMaxElementsWithFirstAndLast(testArray1);
        outPutMassive(testArray1);
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
        int rez = 0;
        int[] checkArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            checkArray[i] = 0;
        }
        checkArray[0] = 1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && checkArray[j] == 0) {
                    if (j == i + 1) {
                        k += 2;
                    } else {
                        k++;
                    }
                    checkArray[j] = 1;
                }
            }
            if (k > 1) {
                rez += k;
                k = 0;
            } else {
                k = 0;
            }
        }
        outPutMassive(checkArray);
        return rez;
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

    static int[] revertingMassive(int[] array) {
        int k = 0;
        int[] testArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            testArray[k] = array[i];
            k++;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = testArray[i];
        }
        return array;
    }

    /*
    Вывести в консоль половину массива, среднеарифметическое которых является большим.
    */

    static void maxHalfSum(int[] array) {
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sumFirstHalf += array[i]; // sumFirstHalf = sumFirstHalf + array[i];
            } else {
                sumSecondHalf += array[i];
            }
        }
        if (array.length % 2 == 1) {
            sumFirstHalf += array[array.length / 2];
        }

        if (sumFirstHalf / (array.length / 2) >= sumSecondHalf / (array.length / 2)) {
            for (int i = array.length / 2; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = array.length - 1; i >= array.length / 2; i--) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    /*
    Найти сумму отрицательных чисел в одномерном массиве.
    */

    static int sumOfNegativeElementsOfMassive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    /*
    Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
    */

    static void elementsBeforeZero(int[] array) {
        int i = 0;
        while (array[i] != 0 && i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    /*
    Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
    */

    static int[] switchMaxElementsWithFirstAndLast(int[] array) {
        int max = maxElementOfMassive(array);
        int k = 0;
        int change;
        int[] testArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                k = i;
            }
        }
        change = array[k];
        array[k] = array[0];
        array[0] = change;
        for (int i = 1; i < array.length; i++) {
            testArray[i - 1] = array[i];
        }
        max = maxElementOfMassive(testArray);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                k = i;
            }
        }
        change = array[k];
        array[k] = array[array.length - 1];
        array[array.length - 1] = change;
        return array;
    }

    /*
    Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
    */

    static void elementsBeforeMinEelement(int[] array) {
        int i = 0;
        while (array[i] != minElementOfMassive(array)) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    /*
    Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
    */

    static int sumOfElementsOfMassiveBetweenMaxAndMin(int[] array) {
        int max = maxElementOfMassive(array);
        int min = minElementOfMassive(array);
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                minIndex = i;
            }
        }
        if (maxIndex > minIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                sum += array[i];
            }
        } else {
            for (int i = maxIndex; i <= minIndex; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    /*
    Вывести в консоль половину массива в которой находиться наименьшее число массива.
    */

    /*
    Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
    */
}

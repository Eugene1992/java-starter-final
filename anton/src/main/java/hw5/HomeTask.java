package hw5;


public class HomeTask {
    public static void main(String[] args) {
        int[] array = {1, 35, 5, 9, 85, 5, 15, -8, 3, -654, 0, -54, -7, -98, -65, 54, 68, 4, 3, 1, 84, 6, 7, 1, 3, -3};

        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int[] array2 = {0,3,1,4,5,6,2,5,5,5,0,0,1,5,4,8,-9,-5,-1,-5,-2,6};//13

        print(array, 0, 1, array.length);

        pairedNumbers(array);

        reverseArr(array);

        halfOfArr(array);

        reverseHalf(array);

        System.out.println("5.");
        System.out.println(sumArr(array));

        averadgeValue(array);

        minMaxOfArr(array);

        replaceOfMinus(array);

        sameNumbers(array2);

        reverseMinMax(array);

        inersionOfArr(array);

        biggerAveradge(array);

        sumOfMinus(array);

        printAllToNull(array);

        replaceMaxWithStartandEnd(array);

        printAllToMin(array);

        sumBetweenMaxMin(array);

        printHalfWithMin(array);

        replacePartToEnd(array1, 6, 10);
    }

    static void print(int[] array, int begin, int step, int end) {
        for (; begin < end; ) {
            System.out.print(array[begin] + " ");
            begin += step;
        }
        System.out.println();
    }

    static void reversePrint(int[] array, int begin, int step, int end) {
        for (; begin > end; ) {
            System.out.print(array[begin] + " ");
            begin -= step;
        }
        System.out.println();
    }

    //    1.Вывести в консоль все парные числа одномерного массива.
    static void pairedNumbers(int[] array) {
        System.out.println("1.");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    //        2.Вывести все числа одномерного массива в обратном порядке.
    static void reverseArr(int[] array) {
//        System.out.println("1.");
//        print(array, array.length - 1, -1, -1);
    }

    //        3.Вывести первую и вторую половину одномерного массива.
    static void halfOfArr(int[] array) {
        System.out.println("3.");
        print(array, 0, 1, array.length / 2);
        print(array, array.length / 2, 1, array.length);
    }

    //        4.Вывести первую и вторую половину одномерного массива в обратном порядке.
    static void reverseHalf(int[] array) {
        System.out.println("4.");
        reversePrint(array, array.length / 2 - 1, 1, -1);
        reversePrint(array, array.length - 1, 1, array.length / 2 - 1);
    }

    //        5.Найти сумму всех элементов в массиве.
    static int sumArr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //        6.Найти среднеарифметическое всех чисел массива.
    static void averadgeValue(int[] array) {
        System.out.println("6.");
        System.out.println(sumArr(array) / array.length);
    }

    //        7.Найти минимальное и максимальное число в массиве.
    static void minMaxOfArr(int[] array) {
        System.out.println("7.");
        int i = 0;
        int max = array[i];
        int min = array[i];
        for (i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    //        8.Заменить все отрицательные числа в массиве на 0.
    static void replaceOfMinus(int[] array) {
        System.out.println("8.");
        int[] arrayBuff = array.clone();
        for (int i = 0; i < arrayBuff.length; i++) {
            if (arrayBuff[i] < 0) {
                arrayBuff[i] = 0;
            }
        }
        print(arrayBuff, 0, 1, arrayBuff.length);
    }

    //        9.Подсчитать одинаковые числа в одномерном массиве.
    //todo
    static void sameNumbers(int[] array) {
        System.out.println("9.");
        int[] arrayBuff = array.clone();
        int counter = 0;
        int value = 0;
        boolean flag = false;
        for (int i = 0; i < arrayBuff.length; i++) {
            for (int j = i + 1; j < arrayBuff.length; j++) {
                if (arrayBuff[i] == arrayBuff[j]) {
                    if (!flag) {
                        flag = true;
                        value = arrayBuff[i];
                    }
                    if (flag) {
                        arrayBuff[j] = value;
                    }
                    counter++;
                }
            }
            print(arrayBuff, 0, 1, arrayBuff.length);
        }
        System.out.println(counter);
    }

    //        10.Поменять минимальное и максимальное числа в массиве местами.
    static void reverseMinMax(int[] array) {
        System.out.println("10.");
        int[] arrayBuff = array.clone();
        print(arrayBuff, 0, 1, arrayBuff.length);
        int i = 0;
        int iMax = i;
        int iMin = i;
        int max = arrayBuff[i];
        int min = arrayBuff[i];
        for (i = 1; i < arrayBuff.length; i++) {
            if (max < arrayBuff[i]) {
                max = arrayBuff[i];
                iMax = i;
            }
            if (min > arrayBuff[i]) {
                min = arrayBuff[i];
                iMin = i;
            }
        }
        arrayBuff[iMax] = min;
        arrayBuff[iMin] = max;
        print(arrayBuff, 0, 1, arrayBuff.length);
    }

    //        11.Инвертировать массив.
    static void inersionOfArr(int[] array) {
        System.out.println("11.");
        int[] arrayBuff = array.clone();
        int buffer;
        for (int i = 0; i < arrayBuff.length / 2; i++) {
            buffer = arrayBuff[i];
            arrayBuff[i] = arrayBuff[arrayBuff.length - 1 - i];
            arrayBuff[arrayBuff.length - 1 - i] = buffer;
        }
        print(arrayBuff, 0, 1, arrayBuff.length);
    }

    //        12.Вывести в консоль половину массива, среднеарифметическое которых является большим.
    static void biggerAveradge(int[] array) {
        System.out.println("12.");
        int arrayIsUnpared = 1;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < array.length / 2 + 1; i++) {
            firstHalfSum += array[i];
            secondHalfSum += array[array.length - 1 - i];
        }
        if (array.length % 2 == 0) {
            arrayIsUnpared = 0;
        }
        if (firstHalfSum > secondHalfSum) {
            print(array, 0, 1, array.length / 2 + arrayIsUnpared);
        }
        if (firstHalfSum < secondHalfSum) {
            print(array, array.length / 2, 1, array.length);
        }
    }

    //        13.Найти сумму отрицательных чисел в одномерном массиве.
    static void sumOfMinus(int[] array) {
        System.out.println("13.");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    //        14.Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
    static void printAllToNull(int[] array) {
        System.out.println("14.");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == 0) {
                System.out.println();
                break;
            }
        }
    }

    //        15.Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
    static void replaceMaxWithStartandEnd(int[] array) {
        System.out.println("15.");
        int[] arrayBuff = array.clone();
        int max = (int) Math.pow(-2, 31);
        int max2 = (int) Math.pow(-2, 31);
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < arrayBuff.length; i++) {
            if (max < arrayBuff[i]) {
                max = arrayBuff[i];
                iMax = i;
            }
        }
        arrayBuff[iMax] = max2;
        for (int i = 0; i < arrayBuff.length; i++) {
            if (max2 < arrayBuff[i]) {
                max2 = arrayBuff[i];
                iMax2 = i;
            }
        }
        arrayBuff[iMax] = arrayBuff[0];
        arrayBuff[0] = max;
        arrayBuff[iMax2] = arrayBuff[arrayBuff.length - 1];
        arrayBuff[arrayBuff.length - 1] = max2;
        print(arrayBuff, 0, 1, arrayBuff.length);
    }

    //        16.Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
    static void printAllToMin(int[] array) {
        System.out.println("16.");
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[iMin] > array[i]) {
                iMin = i;
            }
        }
        print(array, 0, 1, iMin + 1);
    }

    //        17.Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
    static void sumBetweenMaxMin(int[] array) {
        System.out.println("17.");
        print(array, 0, 1, array.length);
        int iMax = 0;
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[iMax] < array[i]) {
                iMax = i;
            }
            if (array[iMin] > array[i]) {
                iMin = i;
            }
        }
        if (iMin > iMax) {
            print(array, iMax, 1, iMin + 1);
        } else {
            System.out.println("Wrong place for min " + iMin + " and max " + iMax);
        }
    }

    //        18.Вывести в консоль половину массива в которой находиться наименьшее число массива.
    static void printHalfWithMin(int[] array) {
        System.out.println("18.");
        int arrayIsUnpared = 1;
        int firstHalfMin = array[0];
        int secondHalfMin = array[array.length / 2];
        for (int i = 0; i < array.length / 2 + 1; i++) {
            if (firstHalfMin > array[i]) {
                firstHalfMin = array[i];
            }
            if (secondHalfMin > array[array.length - 1 - i])
                secondHalfMin = array[array.length - 1 - i];
        }
        if (array.length % 2 == 0) {
            arrayIsUnpared = 0;
        }
        if (firstHalfMin < secondHalfMin) {
            print(array, 0, 1, array.length / 2 + arrayIsUnpared);
        }
        if (firstHalfMin > secondHalfMin) {
            print(array, array.length / 2, 1, array.length);
        }
    }

    //        19.Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
    // 0 1 2 3 4 5    6 7 8 9 10   11 12 13        6
    // todo
    static void replacePartToEnd(int[] array, int begin, int end) {
        System.out.println("19.");
        int[] arrayBuff = array.clone();
        int buffer;
        int loong = arrayBuff.length;
        int diapazon = end - begin + 1;
        for (int i = end; i < loong; i++) {
            buffer = arrayBuff[begin + i];
            arrayBuff[begin + i] = arrayBuff[loong - diapazon + i];
            arrayBuff[loong - diapazon + i] = buffer;
        }
        print(arrayBuff, 0, 1, arrayBuff.length);
    }
}
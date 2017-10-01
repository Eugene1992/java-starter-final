package hw5;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
 Вывести в консоль половину массива в которой находиться наименьшее число массива.
 Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
 */

public class Hw5 {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 5, 6, 7, 345, 436, 346, 0, 78, 90, -5, 6, 888, -34, 345, 345};
//
//        System.out.println("Вывести в консоль все парные числа одномерного массива.");
//        allDoNotEvenNumber(intArray);
//
//        System.out.println("Вывести всесе числа одномерного массива в обратном порядке.");
//        reversePrint(intArray);
//
//        System.out.println("Вывести первую и вторую половину одномерного массива.");
//        printFirstAndSecondHalfOfArray(intArray);
//
//        System.out.println("Вывести первую и вторую половину одномерного массива в обратном порядке.");
//        reversePrinfTwoHalfOfArray(intArray);
//
//        System.out.println("Найти сумму всех элементов в массиве.");
//        int summOfElements = calcSummOfAllElements(intArray);
//        System.out.println(summOfElements);
//
//        System.out.println("Найти среднеарифметическое всех чисел массива.");
//        calcElementsAverage(intArray);
//
//        System.out.println("Найти минимальное и максимальное число в массиве.");
//        calcMaxAndMinElement(intArray);
//
//        System.out.println("Заменить все отрицательные числа в массиве на 0.");
//        inlyPositiveNumbers(intArray);
//
//        System.out.println("Подсчитать одинаковые числа в одномерном массиве.");
//        theSameNumber(intArray);
//
//         ???????
//        System.out.println("Поменять минимальное и максимальное числа в массиве местами.");
//        changeMaxAndMinValue(intArray);
//
//        System.out.println("Вывести в консоль половину массива, среднеарифметическое которых является большим.");
//        thisHalfOfArrayIsBigger(intArray);
//
//        // Найти сумму отрицательных чисел в одномерном массиве.
//        calcSummOfNegativeNumbers(intArray);
//        // Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
//        fromBeginingToFirstZero(intArray);
//
//        // Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
//        makesTwoBiggestNumbersFiestAndLatestElements(intArray);
//
//        // Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
//        printAllElementsToMinimal(intArray);
//
//        // Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
        summOfElementsBetweenMaxAndMinElements(intArray);


    }

    // Вывести в консоль все парные числа одномерного массива.
    private static void allDoNotEvenNumber(int[] array){
        System.out.println("Enum numbers");
        for (int number: array) {
            if (number % 2 == 0){
                System.out.print(" " + number);
            }
        }
    }

    // Вывести все числа одномерного массива в обратном порядке.
    private static void reversePrint(int[] array){
        for (int i = array.length - 1; i >= 0 ; --i) {
            System.out.print(array[i]);
        }
    }

    // Вывести первую и вторую половину одномерного массива.
    private static void printFirstAndSecondHalfOfArray(int[] array){
        System.out.println("First part of array:");
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(" " + array[i]);
        }

        System.out.println("Second part of array:");
        for (int i = array.length / 2; i <= 0; i++) {
            System.out.println(" " + array[i]);
        }
    }

    //  Вывести первую и вторую половину одномерного массива в обратном порядке.
    private static void reversePrinfTwoHalfOfArray(int[] array){
        System.out.println("Second part");
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            System.out.println(" " + array[i]);
        }

        System.out.println("First part");
        for (int i = array.length / 2; i >= 0; i--) {
            System.out.println(" " + array[i]);
        }
    }

    // Найти сумму всех элементов в массиве.
    private static int calcSummOfAllElements(int[] array){
        int valuOfArray = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            valuOfArray += array[i];
        }
        return valuOfArray;
    }

    // Найти среднеарифметическое всех чисел массива.
    private static void calcElementsAverage (int[] array){
        int average = calcSummOfAllElements(array) / array.length;
        System.out.println(average);
    }

    // Найти минимальное и максимальное число в массиве.
    private static void calcMaxAndMinElement(int[] array){
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("Max value: " + maxValue);

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("Min value: " + minValue);
    }

    // Заменить все отрицательные числа в массиве на 0.
    private static void inlyPositiveNumbers(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < 0){
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

    //???????????????????????????????????????????????????????
    // Подсчитать одинаковые числа в одномерном массиве.
    private static void theSameNumber(int[] array){
        int theSameNumberCounter = 0;
        int[] newArray = array;

        for (int i = 0; i < array.length - 1; i++) {

        }
        System.out.println(theSameNumberCounter);
    }

    // ??????????????????????
    // Поменять минимальное и максимальное числа в массиве местами.
    private static void changeMaxAndMinValue(int[] array){
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("Max value: " + maxValue);

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("Min value: " + minValue);

        for (int i = 0; i < array.length -1; i++) {
            if(array[i] == maxValue){
                array[i] = minValue;
            }

            if(array[i] == minValue){
                array[i] = maxValue;
            }
            // ??????????
            String arrayString = array.toString();
            System.out.println(arrayString);
        }

//
//        System.out.println(arrayString);
    }

    // Вывести в консоль половину массива, среднеарифметическое которых является большим.
    private static void thisHalfOfArrayIsBigger(int[] array){
//       Second part
        int firstAverage = 0;
        int secondAverage = 0;

        for (int i = array.length - 1; i >= array.length / 2; i--) {
           firstAverage += array[i];
        }

//       First part
        for (int i = array.length / 2; i >= 0; i--) {
            secondAverage += array[i];
        }

        if(firstAverage >= secondAverage){
            System.out.println("First part of array is bigger");
            System.out.println(firstAverage);
        } else {
            System.out.println("Second part of array is bigger");
            System.out.println(secondAverage);
        }
    }

    // Найти сумму отрицательных чисел в одномерном массиве.
    private static void calcSummOfNegativeNumbers(int[] array){
        int summOfNegativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                summOfNegativeNumbers += array[i];
            }
        }
        System.out.print("Summ of negative numbers is: ");
        System.out.println(summOfNegativeNumbers);
    }

    // Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
    private static void fromBeginingToFirstZero(int[] array){
        System.out.println("Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
            if(array[i] == 0){
                break;
            }
        }
    }

    // ?????????????????????????????????????????????????????????????
    // Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
    private static void makesTwoBiggestNumbersFiestAndLatestElements(int[] array){

    }

    // Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
    private static void printAllElementsToMinimal(int[] array){
        System.out.println("Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.");
        int minElement = 0;

        // find minimal element
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minElement){
                minElement = array[i];
            }
        }
        System.out.println("Min element is: " + minElement);

        // print all to minimal element
        for (int i = 0; i < array.length; i++) {
            if(array[i] == minElement){
                break;
            } else {
                System.out.print(array[i]);
                System.out.println(" ");
            }
        }
    }

    // Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
    private static void summOfElementsBetweenMaxAndMinElements(int[] array){
        System.out.println("Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.");
        int summOfElementsBetweenMaxAndMin = 0;

        // Find MAX and MIN values
        int maxValue = 0;
        int minValue = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("Max value: " + maxValue);

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("Min value: " + minValue);

        // SUMM of all between Max Amd Min
        for (int i = 0; i < array.length; i++) {
          //  if (array)
           //     summOfElementsBetweenMaxAndMin += array[i];
            }
    }

}

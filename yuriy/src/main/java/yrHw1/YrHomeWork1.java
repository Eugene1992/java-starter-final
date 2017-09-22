package yrHw1;

public class YrHomeWork1 {
    public static void main(String[] args) {
        /**
         * Создать четыре целочисленные переменные типов byte, short, int, long.
         Инициализировать переменную типа byte результатом суммы двух любых чисел
         Инициализировать переменную типа short результатом вычитания двух любых чисел
         Инициализировать переменную типа int результатом деления двух любых чисел
         Инициализировать переменную типа long результатом умножения двух любых чисел
         Передать переменной типа byte результат суммы двух переменных типа byte
         Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
         Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
         Поменять значения двух целочисленных переменных используя третью
         Поменять значения двух переменных без использования третей
         Полезные материалы по теме:

         http://www.znannya.org/?view=Java_DataTypes
         http://www.znannya.org/?view=Java_PrimitiveTypes
         */

        // Создать четыре целочисленные переменные типов byte, short, int, long.
        byte a;
        short shortNomber;
        int numberInt;
        long numberlong;

        // Инициализировать переменную типа byte результатом суммы двух любых чисел
        a = 1 + 2;

        // Инициализировать переменную типа short результатом вычитания двух любых чисел
        shortNomber = 2 - 1;

        // Инициализировать переменную типа int результатом деления двух любых чисел
        numberInt = 2 / 1;

        // Инициализировать переменную типа long результатом умножения двух любых чисел
        numberlong = 200 * 23;

        // Передать переменной типа byte результат суммы двух переменных типа byte
        byte numOne = 29;
        byte numTwo = 12;
        byte thirdByte = (byte) (numOne + numTwo);

        // Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        short shortNomberTwo = 34;
        int twoShortDivided = (shortNomber / shortNomberTwo) * (thirdByte / a);

        // Поменять значения двух целочисленных переменных используя третью
        int numberIntSecond = 23;
        int numberIntThird = 100;
        numberIntSecond += numberInt;
        numberIntThird += numberInt;

        // Поменять значения двух переменных без использования третей
        numberIntSecond += 27;
        numberIntThird += 25;
    }
}

package hw6;

public class HomeTask {

    public static void main(String[] args) {
        String firstS = "Hello World!";
        String secondS = "World";

        System.out.println(findBiggerSamePart(firstS, secondS));
    }

//    Написать метод, который вычисляет максимальную по длине общую подстроку из двух переданных строк(аргументы метода).

    public static String findBiggerSamePart(String firstS, String secondS) {
        String longString;
        String shortString;
        String buffer;
        int position;
        int begin = 0;
        int max = 0;

        if (firstS.length() < secondS.length()) {
            shortString = firstS;
            longString = secondS;
        } else {
            shortString = secondS;
            longString = firstS;
        }

        for (int i = 0; i < shortString.length(); i++) {
            for (int j = i; j < shortString.length(); j++) {
                buffer = shortString.substring(i, j);
                position = longString.indexOf(buffer);
                if (position >= 0 && max < j - i + 1) {
                    max = j - i + 1;
                    begin = i;
                }
            }
        }

        if (max == 0) {
            return "No same strings";
        } else {
            buffer = shortString.substring(begin, max + begin);
            return buffer;
        }
    }

//    Написать метод, который будет генерировать пароль(String) заданной длины(аргумент метода) из символов a-z A-Z 0-9.

//    static String passwordGenerator() {
//        return;
//    }
}
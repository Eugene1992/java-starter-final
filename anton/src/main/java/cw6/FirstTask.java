package cw6;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
//        System.out.println(check("The world", "The world"));
//        System.out.println(cutString("Hello world!", 4));
//        System.out.println(cutString("Hello world!", 4, 6));
        System.out.println(toBeginWith("Hello world!", "l"));
        System.out.println(toBeginWith("Hello world!", "l", 3));
        System.out.println(toEndwith("Hello world!", "!"));
    }


    static String cutString(String str, int begin) {
        char[] arr = str.toCharArray();
        for (int i = begin; i < str.length(); i++) {
            arr[i - begin] = arr[i];
        }
        str = String.valueOf(arr);
        return str;
    }

    static String cutString(String str, int begin, int end) {
        char[] arr = str.toCharArray();
        if (end >= str.length()) {
            return str;
        }
        for (int i = begin; i <= end; i++) {
            arr[i - begin] = arr[i];
        }
        str = String.valueOf(arr);
        return str;
    }

    static boolean check(String first, String second) {
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        boolean check = false;
        if (first.length() != second.length()) {
            return check;
        }
        for (int i = 0; i < first.length(); i++) {
            if (firstArr[i] == secondArr[i]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }

    static boolean toBeginWith(String firstStr, String secondStr) {
        char[] firstArr = firstStr.toCharArray();
        char[] secondArr = secondStr.toCharArray();
        if (secondStr.length() > firstStr.length()) {
            return false;
        }
        for (int i = 0; i < secondStr.length(); i++) {
            if (firstArr[i] != secondArr[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean toBeginWith(String firstStr, String secondStr, int begin) {
        char[] firstArr = firstStr.toCharArray();
        char[] secondArr = secondStr.toCharArray();
        if (secondStr.length() + begin > firstStr.length()) {
            return false;
        }
        for (int i = 0; i < secondStr.length(); i++) {
            if (firstArr[i + begin] != secondArr[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean toEndwith(String firstStr, String secondStr) {
        char[] firstArr = firstStr.toCharArray();
        char[] secondArr = secondStr.toCharArray();
        int firstLength = firstStr.length();
        int secondLength = secondStr.length();
        if (firstLength < secondLength) {
            return false;
        }
        for (int i = 1; i <= secondLength; i++) {
            if (firstArr[firstLength - i] != secondArr[secondLength - i]) {
                return false;
            }
        }
        return true;
    }

}

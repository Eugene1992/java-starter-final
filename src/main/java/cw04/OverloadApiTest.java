package cw04;

public class OverloadApiTest {
    public static void main(String[] args) {
        printNumOfTimes(10, true);
    }

    static void printNumOfTimes(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    static void printNumOfTimes(int count, int num) {
        for (int i = 0; i < count; i++) {
            System.out.println(num);
        }
    }

    static void printNumOfTimes(int count, boolean bool) {
        for (int i = 0; i < count; i++) {
            System.out.println(bool);
        }
    }
}

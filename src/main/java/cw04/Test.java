package cw04;

public class Test {
    public static void main(String[] args) {
        printNumOfTimes(10, "Hello world!");
        String hello = duplicateString(10, "Hello");
        System.out.println(hello);

        int intervalSum = calcIntervalSum(1, 5);
        System.out.println(intervalSum);
    }

    static void printNumOfTimes(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    static String duplicateString(int count, String str) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }

    static int calcIntervalSum(int start, int end) {
        int sum = 0;
        for (; start <= end; start++) {
            sum += start;
        }
        return sum;
    }
}

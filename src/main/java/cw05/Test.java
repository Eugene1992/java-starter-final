package cw05;

public class Test {
    public static void main(String[] args) {
        byte[] array1 = new byte[3];

        byte array2[] = new byte[3];

        byte[] array3 = new byte[]{1, 2, 3};

        byte array4[] = {1, 2, 3};

        byte[][][][][][][][][][] array5 = new byte[3][3][3][3][3][3][3][3][3][3];

        int[] array6 = new int[Integer.MAX_VALUE];
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }
}

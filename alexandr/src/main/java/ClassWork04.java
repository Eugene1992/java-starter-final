public class ClassWork04 {
    public static void main(String[] args) {
        int[] array = {111, 9, 5, 9, 6};
//        System.out.println(sumArray(array));
//        System.out.println(maxNumberOfArray(array));

        maxHalfSum(array);
    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int maxNumberOfArray(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        return max;
    }

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
        if (array.length % 2 == 1) sumFirstHalf += array[array.length / 2];

        if (sumFirstHalf / (array.length / 2) >= sumSecondHalf / (array.length / 2)) {
            for (int i = array.length / 2; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = array.length - 1; i >= array.length / 2; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

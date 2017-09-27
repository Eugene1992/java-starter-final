public class ClassWork04 {
    public static void main(String[] args) {
        int[] array = {1,9,5,9};
//        System.out.println(sumArray(array));
//        System.out.println(maxNumberOfArray(array));

        maxHalfSum(array);
    }

    static int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int maxNumberOfArray(int[] array){
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            if (max <= array[i]){
                max = array [i];
            }
        }
        return max;
    }

    static void maxHalfSum(int[] array){
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for (int i = 0; i < array.length / 2 ; i++) {
            sumFirstHalf += array[i];
        }
        for (int i = 0; i < array.length / 2 ; i++) {
            sumSecondHalf += array[array.length-1-i];
        }

        if (sumFirstHalf / (array.length / 2) >= sumSecondHalf / (array.length / 2)){
            for (int i = array.length / 2-1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = 0; i < array.length / 2 ; i++) {
                System.out.print(array[array.length-1-i] + " ");
            }
        }
    }
}

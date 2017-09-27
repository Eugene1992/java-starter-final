package cw05;

public class RoundTest {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 1},
                {1, 5, 6, 1},
                {1, 1, 1, 1}
        };

        System.out.println(calcRoundSum(arr));
    }

    static int calcRoundSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || i == 0 || j == arr[i].length - 1 || i == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}

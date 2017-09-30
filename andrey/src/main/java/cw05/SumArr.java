package cw05;

public class SumArr {
    public static void main(String[] args) {

        int sum = 0;
        int x = 5, y = 4; //задается размер массива
        int arr[][] = {
                {5, 1, 1, 5,1},
                {1, 5, 6, 1,1},
                {1, 8, 6, 4,1},
                {2, 1, 8, 0,1}
        };
        System.out.println("Sum of numbers: "+sumArr(arr,x, y));
    }

    static int sumArr(int a[][], int x, int y) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum = sum + a[0][i] + a[y - 1][i];
        }
        for (int i = 0; i < y; i++) {
            sum = sum + a[i][x - 1]+a[i][0];
        }
        sum = sum - a[0][0] - a[0][x - 1] - a[y - 1][0] - a[y - 1][x - 1];
        return sum;
    }
}


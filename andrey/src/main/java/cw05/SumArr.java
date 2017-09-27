package cw05;

public class SumArr {
    public static void main(String[] args) {


        int arr[][] = {
                {1, 3, 4, 5},
                {4, 5, 6, 7},
                {9, 8, 6, 4},
                {2, 6, 9, 0}

        };
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i][0]);
        }
        System.out.println(sumArr(arr));
    }

    static int sumArr(int a[][]) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x = x + a[i][0];

        }
        return x;
    }
}


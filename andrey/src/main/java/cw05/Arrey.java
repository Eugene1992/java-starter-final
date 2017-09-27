package cw05;

public class Arrey {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5,6};
        System.out.println(sumArr(arr));
    }

    static int sumArr(int a[]) {
        int x = 0;
        for (int i = 0; i < 6; i++) {
            x = x + a[i];

        }
        return x;
    }
}

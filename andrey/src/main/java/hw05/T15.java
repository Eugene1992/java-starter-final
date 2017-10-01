package hw05;

public class T15 {
    public static void main(String[] args) {
        int x;
        int arr[] = {-1, 3, 0, 44, 66, 21, -8, 0, 23, 45, 8};
        System.out.println("Initial position:");
        printArr(arr);
        int max = maxNum(arr);
        int max2 = maxNum2(arr, max);
      //меняем местами переменные
        x = arr[0];
        arr[0] = arr[max];
        arr[max] = x;
        x = arr[arr.length-1];
        arr[arr.length-1] = arr[max2];
        arr[max2] = x;
        printArr(arr);
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
    }

    static int maxNum(int arr[]) {
        int y = 0, x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                x = arr[i];
                y = i;
            }
        }
        System.out.println("\n" + x);
        return y;
    }

    static int maxNum2(int arr[], int max) {
        int y = 0, x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i] && i != max) {
                x = arr[i];
                y = i;
            }
        }
        System.out.println(x);
        return y;
    }
}

package hw05;

public class T16 {
    public static void main(String[] args) {
        int arr[] = {-1, 45, 78, 1, 0, 45, -3, 22, 1, -5, 56, 8};
        ptintArr(arr);
        int min = minNum(arr);
        for (int i = 0; i < min; i++) {
            System.out.print("  " + arr[i]);
        }
    }

    static int minNum(int arr[]) {
        int y = 0, x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) {
                x = arr[i];
                y = i;
            }
        }
        System.out.println("\n" + x);
        return y;
    }

    static void ptintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
    }
}


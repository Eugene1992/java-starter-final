package cw05;

public class MaxNum {
    public static void main(String[] args) {
        int arr[] = {99, 2, 3, 19, 5, 6, 7, 111};
        int x = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                x = arr[i];
            }
        }
        System.out.println(x);
    }

}

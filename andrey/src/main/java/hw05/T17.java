package hw05;

public class T17 {
    public static void main(String[] args) {
        int max, min;
        int arr[]={1,2,3,0,4,55,6,7,8,-9,6,4};
        printArr(arr);
        max=maxNum(arr);
        min=minNum(arr);
        sumInt(arr,min, max);


    }
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
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
    static void sumInt(int arr[], int min, int max){
        int sum=0;
        if (min<max){
            for (int i = min+1; i <max ; i++) {
                sum=sum+arr[i];
            }
            System.out.println("Sum: "+sum);
        }
        if (min>max){
            for (int i = max+1; i <min ; i++) {
                sum=sum+arr[i];
            }
            System.out.println("Sum: "+sum);
        }
    }
}

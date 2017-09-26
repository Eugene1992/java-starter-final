package cw4;

public class ThirdTaskSumPol {
    public static void main(String[] args) {
        int count = 0;
        partSum(count);
    }


    static void partSum(int count) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                if (i + j + k == l + m + n) {
                                    System.out.print((i * 100000 + j * 10000 + k * 1000 + l * 100 + m * 10 + n + " "));
                                    count++;
                                    if (count % 10 == 0) {
                                        System.out.println("");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\nThe number of such number is " + count);
    }
}
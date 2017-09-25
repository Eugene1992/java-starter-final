import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        x = scan.nextInt();
        if (x >= 0 && x <= 14) {
            System.out.println("Number is into the gap [0-14]");
        }
        if (x >= 15 && x <= 35) {
            System.out.println("Number is into the gap [15-35]");
        }
        if (x >= 36 && x <= 50) {
            System.out.println("Number is into the gap [36-50]");
        }
        if (x >= 51 && x <= 100) {
            System.out.println("Number is into the gap [51-100]");
        }
        if (x > 100 || x < 0) {
            System.out.println("Number is out of range");
        }
    }
}

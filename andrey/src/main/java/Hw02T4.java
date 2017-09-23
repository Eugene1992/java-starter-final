import java.util.Scanner;

public class Hw02T4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (a > c && a > b){
            System.out.println("Max number "+a);
        }
        if (b > c && b > a) {
            System.out.println("Max number " + b);
        }
        if (c > a && c > b) {
            System.out.println("Max number " + c);
        }
    }
}
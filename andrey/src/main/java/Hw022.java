import java.util.Scanner;

public class Hw022 {
    public static void main(String[] args) {
        double a;
        double z;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        z = a % 2;
        if (z == 0) {
            System.out.println("Your number is even");
        }
        if (z == 1) {
            System.out.println("Your number is uneven");
        }
        if (z < 1 || z > 1) {
            System.out.println("Your number is drobniy");
        }

    }
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       // char a;
        double x, z, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = scan.nextDouble();
        System.out.println("Enter the second number:");
        z = scan.nextDouble();
        System.out.println("Enter operation  + - * /:");
         String a = scan.nextLine();
        //???????    if (a != "/" || a != "*" || a != "-" || a != "+") {
        //  System.out.println("It is not operation");
        //}
        switch (a) {
            case "+": {
                y = x + z;
                break;
            }

        }
        System.out.println(y);


    }
}

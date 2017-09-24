import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       // char a;
        double x, z, y = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = scan.nextDouble();
        System.out.println("Enter the second number:");
        z = scan.nextDouble();
        System.out.println("Enter operation  + - * /:");
        String act = scan.next();
     /*     if (act != "/" || act != "*" || act != "-" || act != "+") {
          System.out.println("It is not operation");
    }*/
        switch(act)

    {
        case "+": {
            y = x + z;
            break;

        }
        case "-": {
            y = x - z;
            break;
        }
        case "*": {
            y = x * z;
            break;
        }
        case "/": {
            if (z==0) {
                System.out.println("You can not divide to 0");
            }
            else  {
            y=x/z; }

        }


    }
        System.out
                .println(y);


}
}

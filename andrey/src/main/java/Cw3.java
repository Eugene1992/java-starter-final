import java.util.Scanner;

public class Cw3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = (int)(Math.random()*10);
        System.out.println("Guess my number!!");
        System.out.println("Enter a number from 1 to 10:");
       int i = scan.nextInt();
       for (int z = 1; z<111; z++) {
           if (i == x) {
               System.out.println("Congratulations!");
               if (z == 0) {
                   System.out.println("You are the best!");
               } else {
                   System.out.println("you guessed from " + z + "times");
               }
               break;
           } else {
               if (z==4) {
                   System.out.println("You are Looser!");
               }
               if (z==6) {
                   System.out.println("You are the best looser!");
               }
               }
               System.out.println("Try once more");
               i = scan.nextInt();
           }
       }
    }

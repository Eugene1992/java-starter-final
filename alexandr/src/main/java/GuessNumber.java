import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        int k = 0;
        while (true) {
            System.out.println("Guess My Number!");
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            if (s.equals("exit")) break;
            k++;

            int x = Integer.parseInt(s);
            if (x < randomInt) {
                System.out.println("My Number is bigger!");
            } else if (x > randomInt){
                System.out.println("My Number is lower!");
            } else {
                System.out.println("You are right! Number of Guest's " + k);
                break;
            }
        }
    }
}
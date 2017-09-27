package cw3;

import java.util.Random;
import java.util.Scanner;

public class GuestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomvalue = (int) (Math.random() * 4);
        int value = 100500;
        System.out.println(randomvalue);

        while (value != 0) {

            System.out.println("Enter your number for start: ");
            String userValueString = scanner.next();
            int userValueInt = Integer.parseInt(userValueString);

            System.out.println("Enter 0 for exit.");

            if (randomvalue == userValueInt) {
                System.out.println("You are right");
                System.out.println("See you!");
                value = 0;
                scanner.close();
            } else {
                System.out.println("Sorry. Try again.");
            }

            if (userValueInt == 0) {
                value = 0;
                scanner.close();
            }
        }
    }
}

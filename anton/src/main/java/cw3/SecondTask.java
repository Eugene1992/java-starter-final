package cw3;

import java.util.Random;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        //GUEST MY NUMBER
        Random randGen = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Welkome to my game!");
        System.out.println("You should guest my number from 0 to 10.");
        System.out.println("You have 10 attempts.");
        System.out.println("Lets start:");

        boolean win = false;
        int randInt = randGen.nextInt(11);

        for (int i = 0; i < 10; i++) {
            randInt = randGen.nextInt(11);
            int a = scan.nextInt();
            if (a == randInt) {
                System.out.println("You are lucky boy, Congrats!");
                win = true;
                break;
            } else {
                continue;
            }
        }
        if (win == false) {
            System.out.println("You lose, my number was " + randInt);
        }

    }
}

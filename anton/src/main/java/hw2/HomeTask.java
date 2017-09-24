package hw2; // TODO: 24.09.2017  

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //2
        System.out.println("2.");
        int firstVal = scan.nextInt();
        if (firstVal % 2 == 1) {
            System.out.println("This value is uneven");
        } else {
            System.out.println("This value is even");
        }

        //4
        System.out.println("4.");
        int fourthVal = 574;
        int fifthsVal = 24;
        int sixthVal = 486;
        int answer;
        answer = fourthVal > fifthsVal ? fifthsVal : fourthVal;
        answer = answer > sixthVal ? sixthVal : answer;
        System.out.println(answer);
    }
}

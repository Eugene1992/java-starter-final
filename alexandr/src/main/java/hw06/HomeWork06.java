package hw06;

import java.util.Random;

public class HomeWork06 {
    /*
    Написать метод, который будет генерировать пароль(String) заданной длины(аргумент метода) из символов a-z A-Z 0-9.
     */
    public static void main(String[] args) {
        System.out.println(generatePassword(7));
    }

    static String generatePassword(int size) {
        char[] elements = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String password = "";
        Random randomGenerator = new Random();
        for (int i = 0; i < size; i++) {
            int randomInt = randomGenerator.nextInt(elements.length);
            password += elements[randomInt];
        }
        return password;
    }
}

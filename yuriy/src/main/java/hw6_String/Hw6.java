package hw6_String;

import java.security.SecureRandom;
import java.util.Random;

public class Hw6 {
    private static final int PASSWORD_LENGTH = 8;
    private static final Random RANDOM = new SecureRandom();

    public static void main(String[] args) {
        // Написать метод, который будет генерировать пароль(String) заданной длины(аргумент метода) из символов a-z A-Z 0-9.
        passwordGenerator(PASSWORD_LENGTH);

        // Написать метод, который вычисляет максимальную по длине общую подстроку из двух переданных строк(аргументы метода).

    }

    // Написать метод, который будет генерировать пароль(String) заданной длины(аргумент метода) из символов a-z A-Z 0-9.
    private static void passwordGenerator(int numberOfCharacters) {
        // Array of chars
//        char[] characters = {'a', 'b', 'c', 'd', e, f, g, h, j, k, m, n, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, J, K, M, N, P, Q, R, S, T, U, V, W, X, Y, Z, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        // Random class
        String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ0123456789";
        String newPassword = "";
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = RANDOM.nextInt() * letters.length();
            newPassword += letters.substring(randomIndex, randomIndex + 1);
        }
        System.out.println(newPassword);
    }

    // Написать метод, который вычисляет максимальную по длине общую подстроку из двух переданных строк(аргументы метода).

}


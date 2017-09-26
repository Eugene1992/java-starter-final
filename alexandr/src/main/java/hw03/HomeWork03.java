package hw03;

public class HomeWork03 {
    public static void main(String[] args) {
        /*
        Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        */

        System.out.println("Четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….");
        int k = 1;
        for (int i = 1000; i <= 9999; i += 3) {
            System.out.print(i + " ");
            if (k % 25 == 0) {
                System.out.println("");
            }
            k++;
        }

        /*
        Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        */

        System.out.println("");
        System.out.println("Первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….");
        k = 1;
        for (int i = 1; i <= 1000; i += 2) {
            System.out.print(i + " ");
            if (k % 45 == 0) {
                System.out.println("");
            }
            k++;
            if (k == 55) {
                break;
            }
        }

        /*
        Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        */

        System.out.println('\n');
        System.out.println("Неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….");
        int x = 90;
        while (x > 0) {
            System.out.print(x + " ");
            x -= 5;
        }

        /*
        Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        */

        System.out.println('\n');
        System.out.println("Первые 20 элементов последовательности 2 4 8 16 32 64 128 ….");
        int y = 1;
        while (y <= 20) {
            System.out.print(Math.pow(2, y) + " ");
            y++;
        }

        /*
        Выведите на экран первые 20 членов последовательности Фибоначчи.
        */

        System.out.println('\n');
        System.out.println("Первые 20 членов последовательности Фибоначчи.");
        int n = 1;
        int m = 1;
        System.out.print(m + " " + n + " ");
        for (int i = 1; i <= 18; i++) {
            int l = n + m;
            n = m;
            m = l;
            System.out.print(m + " ");
        }

    }
}

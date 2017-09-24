package hw2;

/**
 * Задание 4
 * Задано три переменных, найти и вывести на экран переменную с максимальным значением
 * (значения всех переменных разные).
 */
public class Task4 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please, enter number one: ");
//        int valueNumberOne = scanner.nextInt();
//        System.out.println("Please, enter number two: ");
//        int valueNumberTwo = scanner.nextInt();
//        System.out.println("Please, enter number three: ");
//        int valueNumberThree = scanner.nextInt();

        int valueNumberOne = 23;
        int valueNumberTwo = 39;
        int valueNumberThree = 4;

        if (valueNumberOne > valueNumberTwo && valueNumberOne > valueNumberThree) {
            System.out.println(valueNumberOne);
        } else if (valueNumberTwo > valueNumberOne && valueNumberTwo > valueNumberThree) {
            System.out.println(valueNumberTwo);
        } else {
            System.out.println(valueNumberThree);
        }
    }
}

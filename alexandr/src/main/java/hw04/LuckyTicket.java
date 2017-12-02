package hw04;

public class LuckyTicket {

    /*
    Счастливые билетики. Есть билеты с номерами от 000001 до 999999.
    «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как,
    например, в билетах с номерами 003102 или 567576. С помощью программы, подсчитайте сколько счастливых билетов.
     */

    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 999999; i++) {
            if (luckyNumber(i)) {
                System.out.println(i);
                k++;
            }
        }
        System.out.println(k);
    }

    static boolean luckyNumber(int n) {
        String numberString = Integer.toString(n);
        int m = numberString.length();
        if (m < 6) {
            for (int i = 0; i < 6 - m; i++) {
                numberString = "0" + numberString;
            }
        }
        String firstHalfString = "";
        for (int i = 0; i < numberString.length() / 2; i++) {
            firstHalfString += numberString.charAt(i);
        }
        String secondHalfString = "";
        for (int i = numberString.length() / 2; i < numberString.length(); i++) {
            secondHalfString += numberString.charAt(i);
        }
        int firstHalfNumber = Integer.parseInt(firstHalfString);
        int secondHalfNumber = Integer.parseInt(secondHalfString);
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < firstHalfString.length(); i++) {
            firstSum += firstHalfNumber % 10;
            firstHalfNumber /= 10;
        }
        for (int i = 0; i < secondHalfString.length(); i++) {
            secondSum += secondHalfNumber % 10;
            secondHalfNumber /= 10;
        }
        if (firstSum == secondSum) {
            return true;
        } else {
            return false;
        }
    }
}

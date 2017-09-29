package hw04;

public class NotLuckyNumber {

    /*
    Не счастливые номера. Есть 999999 номерных знаков,
    подсчитать количество знаков содержащих число 13 и вывести их все в консоль
     */

    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 999999 ; i++) {
            if (notLuckyNumber(i)){
                System.out.println(i);
                k++;
            }
        }
        System.out.println(k);
    }

    static boolean notLuckyNumber(int n){
       String numberString = Integer.toString(n);
       boolean f = false;
       for (int i = 0; i < numberString.length() - 1 ; i++) {
           String checkString = "" + numberString.charAt(i) + numberString.charAt(i+1);
           if ((checkString).equals("13")) {
               f = true;
               break;
           }
        }
        return f;
    }
}

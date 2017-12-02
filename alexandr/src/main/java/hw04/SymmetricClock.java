package hw04;

public class SymmetricClock {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так,
    что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия
    (например, 02:20, 11:11 или 15:51).
     */
    public static void main(String[] args) {
        System.out.println(symmetricClockNumber());
    }

    static int symmetricClockNumber() {
        int k = 0;
        String stringHours;
        String stringMinutes;
        char switchSymbol1 = 0;
        char switchSymbol2 = 0;
        for (int i = 0; i < 24; i++) {
            stringHours = Integer.toString(i);
            if (stringHours.length() == 1) {
                stringHours = "0" + stringHours;
            }
            for (int j = 0; j < 60; j++) {
                stringMinutes = Integer.toString(j);
                if (stringMinutes.length() == 1) {
                    stringMinutes = "0" + stringMinutes;
                }
                switchSymbol1 = stringMinutes.charAt(0);
                switchSymbol2 = stringMinutes.charAt(1);
                stringMinutes = "" + switchSymbol2 + switchSymbol1;
                if (stringHours.equals(stringMinutes)) {
                    k++;
                    System.out.println(stringHours + ":" + switchSymbol1 + switchSymbol2);
                }
            }
        }
        return k;
    }

}

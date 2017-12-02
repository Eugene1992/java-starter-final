package cw6;

public class Cw6 {
    public static void main(String[] args) {
        String string = "Hello world";
        String str1 = "YPlus";
        String startWith = "Hell";<<<<<<< yr_hw7
        String endWith = "rld";
        int firstNumberOfChar = 1;

        //substring
        System.out.println("substring");
        subFrom(string, 2);

        // equals
        System.out.println("Equals");
        equalsToMethod(string, str1);

        // start with
        System.out.println("Start with:");

        startwith(string, startWith, firstNumberOfChar);

        // end with
        System.out.println("End with:");
        endWith(string, endWith);
    }
    // substring string
    static void subFrom(String string, int from) {
        char chararray[] = string.toCharArray();
        char newCharArray[] = new char[0];
        for (int i = from; from <= chararray.length; i++) {
            System.out.print(newCharArray);
        }
    }

    // equals
    static boolean equalsToMethod(String string, String str1) {
        char charArrayOne[] = string.toCharArray();
        char charArrayTwo[] = str1.toCharArray();

        if (charArrayOne == charArrayTwo) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    // start with c отступом
    static boolean startwith(String string, String fromWhatString, int fromWhatCharachter) {
        char[] charArrayFromString = string.toCharArray();
        char[] charArrayFromUserInput = fromWhatString.toCharArray();

        char[] arrayForFirstWord = new char[100500600];
        char[] arrayForFullwordFromCharacrer = new char[100500600];

        // add all first words to array
        for (int i = fromWhatCharachter; i < charArrayFromString.length; i++) {
            arrayForFirstWord[i] = arrayForFirstWord[i];
        }

        //add all characters from users input
        for (int i = 0; i < charArrayFromUserInput.length; i++) {
            charArrayFromUserInput[i] = arrayForFullwordFromCharacrer[i];
        }

        // comparison of 2 char arrays
        for (int i = 0; i < arrayForFirstWord.length; i++) {
            for (int j = 0; j < arrayForFullwordFromCharacrer.length; j++) {
                if (arrayForFirstWord[i] == arrayForFullwordFromCharacrer[i] || arrayForFirstWord[j] == arrayForFullwordFromCharacrer[j]) {
                    System.out.println("true");
                    return true;
                }
            }
        }
        return false;
    }

    static boolean endWith(String ourString, String wordsFromEnd) {
        char[] charArrayFromString = ourString.toCharArray();
        char[] charArrayFromEnd = wordsFromEnd.toCharArray();
        char[] arrayString = new char[100500];
        char[] arrayEnd = new char[100500];

        for (int i = charArrayFromString.length; i > 0; --i) {
            charArrayFromString[i] = arrayString[i];
        }

        for (int i = charArrayFromEnd.length; i > 0; --i) {
            charArrayFromEnd[i] = charArrayFromEnd[i];
        }

        for (int i = arrayString.length; i > 0; --i) {
            for (int j = arrayEnd.length; j > 0; --j) {
                if (arrayString[i] == arrayEnd[i] || arrayString[j] == arrayEnd[j]) {
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }
}

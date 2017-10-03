public class ClassWork05 {

    public static void main(String[] args) {
        String testString = "Hello World!";
        String testString2 = "Hello World!";
//        System.out.println(substringMyVersion(testString, 2,5));
//        System.out.println(equalsStringMyVersion(testString, testString2));
        System.out.println(startWithMyVersion(testString, "l", 4));

    }

    static String substringMyVersion(String string, int startPosition) {
        char[] charArray = string.toCharArray();
        String outPutString = "";
        for (int i = startPosition; i < charArray.length; i++) {
            outPutString += charArray[i];
        }
        return outPutString;
    }

    static String substringMyVersion(String string, int startPosition, int endPosition) {
        char[] charArray = string.toCharArray();
        String outPutString = "";
        for (int i = startPosition; i < endPosition; i++) {
            outPutString += charArray[i];
        }
        return outPutString;
    }

    static boolean equalsStringMyVersion(String firstString, String secondString) {
        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();
        if (firstCharArray.length != secondCharArray.length) {
            return false;
        } else {
            for (int i = 0; i < firstCharArray.length; i++) {
                if (firstCharArray[i] != secondCharArray[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean startWithMyVersion(String string, String prefix, int position) {
        char[] stringArray = string.toCharArray();
        char[] prefixArray = prefix.toCharArray();
        if (position >= stringArray.length || (prefixArray.length + position >= stringArray.length)) {
            return false;
        }
        for (int i = position, j = 0; j < prefixArray.length; i++, j++) {
            if (stringArray[i] != prefixArray[j]) {
                return false;
            }
        }
        return true;
    }

    static boolean startWithMyVersion(String string, String prefix) {
        return startWithMyVersion(string, prefix, 0);
    }

}

public class ClassWork05 {

    public static void main(String[] args) {
        String testString = "Hello World!";
        String testString2 = "Hello world!";
//        System.out.println(substringMyVersion(testString, 2,5));

        System.out.println(equalsStringMyVersion(testString, testString2));
    }

    static String substringMyVersion(String string, int startPosition){
        char[] charArray = string.toCharArray();
        String outPutString ="";
        for (int i = startPosition; i < charArray.length; i++) {
            outPutString+=charArray[i];
        }
        return outPutString;
    }

    static String substringMyVersion(String string, int startPosition, int endPosition){
        char[] charArray = string.toCharArray();
        String outPutString ="";
        for (int i = startPosition; i < endPosition; i++) {
            outPutString+=charArray[i];
        }
        return outPutString;
    }

    static boolean equalsStringMyVersion(String firstString, String secondString){
        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();
        boolean equals = false;
        if (firstCharArray.length != secondCharArray.length){
            equals = false;
        } else {
            for (int i = 0; i < firstCharArray.length; i++) {
                if (firstCharArray[i] == secondCharArray[i]){
                    equals = true;
                } else {
                    equals = false;
                    break;
                }
            }
        }

        return equals;
    }

}

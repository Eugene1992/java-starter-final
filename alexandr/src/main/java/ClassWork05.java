public class ClassWork05 {

    public static void main(String[] args) {
        String testString = "Hello World!";
        System.out.println(substringMyVersion(testString, 2,5));
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
}

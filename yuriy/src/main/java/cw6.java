public class cw6 {
    public static void main(String[] args) {
        //substring
        String string = "Hello";
        String str1 = "YPlus";

//        subFrom(string, 3);

        // equals
//        equalsToMethod(string, str1);

        // start with
        startwith(string, str1, 10);
    }


    //    substring string
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
    static void startwith(String string, String secondString, int from) {
        char charArrayOne[] = string.toCharArray();
        char charArrayTwo[] = secondString.toCharArray();
//        char newArrayOfChars1[] = new char[charArrayOne.length];
//        char newArrayOfChars2[] = new char[charArrayTwo.length];
//        char array1[] = new char[charArrayOne.length];
//        char array2[] = new char[charArrayTwo.length];
//
        if (from >= charArrayOne.length && from >= charArrayTwo.length) {
//            for (int i = from; i <= charArrayOne.length; i++) {
////                System.out.print(charArrayOne);
//                newArrayOfChars1[i] = array1[i];
//            }
//
//            for (int i = from; i <= charArrayTwo.length; i++) {
//                newArrayOfChars2[i] = array2[i];
//            }
//
//            if(array1[0] == array2[0]){
//                System.out.println("true");
////                return true;
//            } else {
//                System.out.println("false");
////                return false;
//            }

        if (charArrayOne[from] == charArrayTwo[from]) {
            System.out.println("true");
//            return true;
        } else {
            System.out.println("false");
//            return false;
        }

//
//        } else {
//            System.out.println("Your string is too short for this, looser");
//            return false;
        }
//
    }


    // end with

}

package cw06;

public class T2 {
    public static void main(String[] args) {

        String s1 = "Hello World!";
        String s2 = "Hello World!";
        String s3 = "Hello WORLD!!";
        boolean x;
        x = equal(s1, s2);
        System.out.println(x);
        System.out.println(equalNoCase(s1, s3));
    }

    static boolean equal(String x1, String x2) {
        char y1[], y2[];
        y1 = x1.toCharArray();
        y2 = x2.toCharArray();
        if (y1.length != y2.length) {
            return false;
        }
        for (int i = 0; i < x1.length(); i++) {
            if (y1[i] != y2[i]) {

                return false;
            }
        }
        return true;
    }


    static boolean equalNoCase(String x1, String x2) {
        char y1[], y2[];
        y1 = x1.toCharArray();
        y2 = x2.toCharArray();
        if (y1.length != y2.length) {
            return false;
        }
        for (int i = 0; i < x1.length(); i++) {
            if (y1[i] != y2[i]) {
                if (Character.toUpperCase(y1[i]) != Character.toUpperCase(y2[i])) {
                    return false;
                }

            }
        }
        return true;
    }
}




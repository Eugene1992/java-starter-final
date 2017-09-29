package cw06;

public class T1 {
    public static void main(String[] args) {

        String s = "Hello world!!";
        int x = 4;
        int start = 2, end = 5;
        cut(s, x);
        System.out.println(" ");
        cutint(s, start, end);


    }

    static void cut(String z, int y) {
        char chars[];
        chars = z.toCharArray();
        for (int i = y; i < z.length(); i++) {

            System.out.print(chars[i]);
        }

    }

    static void cutint(String s, int start, int end) {
        char chars[];
        chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (i < start || i > end) {
                System.out.print(chars[i]);
            }
        }
    }
}


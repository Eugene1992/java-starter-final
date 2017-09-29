package cw06;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = new String("Hello world");
        String s3 = s1 + s2; // concatenation

        String s4 = "" + true + 10 + 10.0 + new Object() + 'g';

        String s5 = "Hello world!".substring(2, 6);

        System.out.println(s5);
    }
}

package cw06;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello world!";

        boolean isContain = s.contains("wor");
        System.out.println(isContain);

        boolean isEquals = s.equals("Hello world!");
        System.out.println(isEquals);

        System.out.println(s.isEmpty());
        System.out.println("".isEmpty());

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        System.out.println(s.equals("Hello worlD!"));
        System.out.println(s.equalsIgnoreCase("Hello worlD!"));

        System.out.println(s.compareTo("Abc"));

        String[] split = "London is a capital of Great Britain!".split(" ");
        System.out.println(Arrays.toString(split));

        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 4));

        System.out.println(s.startsWith("Hell"));
        System.out.println(s.startsWith("Hell", 3));
        System.out.println(s.startsWith("lo", 3));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.endsWith("!"));

        System.out.println(s.concat("!!"));

        System.out.println(s.indexOf('l'));
        System.out.println(s.indexOf('l', 4));
        System.out.println(s.indexOf("llo"));
        System.out.println(s.indexOf("llo", 4));

        System.out.println(s.replace("Hello", "Hi"));

        System.out.println(s.length());

        System.out.println("  sdsdss    ".trim());
    }
}

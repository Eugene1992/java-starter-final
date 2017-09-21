package cw02;

public class SwitchTest2 {
    public static void main(String[] args) {
        String s = "A";

        if (s.equals("A")) {
            System.out.println(10);
        } else if (s.equals("B")) {
            System.out.println(11);
        } else if (s.equals("C")) {
            System.out.println(12);
        } else if (s.equals("D")) {
            System.out.println(13);
        } else if (s.equals("E")) {
            System.out.println(14);
        } else {
            System.out.println(15);
        }

        switch (s) { // primitives, string, ENUM
            case "A":
                System.out.println(10);
            case "B":
                System.out.println(11);
                break;
            case "C":
                System.out.println(12);
                break;
            case "D":
                System.out.println(13);
                break;
            case "E":
                System.out.println(14);
                break;
            default:
                System.out.println(15);
        }
    }
}

package cw03;

public class LeftShiftTest {
    public static void main(String[] args) {
        byte b = (byte) (113 << 3);
        System.out.println(b);

//       0111 0001
//    3<<
//       1000 1000

        System.out.println(64 << 2);
        System.out.println(64 >> 2);
    }
}

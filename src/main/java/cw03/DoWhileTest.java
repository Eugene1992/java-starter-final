package cw03;

public class DoWhileTest {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println(count);
            count++; // COUNT = COUNT + 1; || COUNT += 1;
        } while (count > 10);
    }
}

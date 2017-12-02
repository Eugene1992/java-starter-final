package cw03;

public class WhileTest {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10 && count != 5) {
            System.out.println(count);
            count++; // COUNT = COUNT + 1; || COUNT += 1;
        }
    }
}

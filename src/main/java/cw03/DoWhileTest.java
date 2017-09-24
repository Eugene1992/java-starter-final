package cw03;

public class DoWhileTest {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println(count);
            count++; // count = count + 1; || count += 1;
        } while (count > 10);
    }
}

import javax.sound.sampled.Control;

public class ClassWork02 {
    public static void main(String[] args) {

        int x = 21;
        int k = 0;
        String s = "";
        while (x != 0) {

            if ( k % 4 == 0 ) {
                s = " " + s;
            }

            int b = x % 2;
            String s1;
            s1 = Integer.toString(b);
            s = s1 + s;
            x = x / 2;
            k++;

        }

        System.out.println(s);

    }
}

public class ClassWork02 {
    public static void main(String[] args) {

        int x = 1000;
        int k = 0;
        String s = "";
        while (x != 0) {

            if ( k % 4 == 0 ) {
                s = " " + s;
            }

            s = x % 2 + s;
            x = x / 2;
            k++;

        }

        System.out.println(s);

    }
}

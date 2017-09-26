public class CalculatePalindromsInInterval {
    public static void main(String[] args) {
        System.out.println(palindromOk(123321));
        int k=0;
        for (int i = 1; i <= 999999; i++){
            if (palindromOk(i)) {k++;}
        }
        System.out.println(k);
    }

    static boolean palindromOk (int n){
        String primeS = Integer.toString(n);
        String reversS = "";
        for (int i = 0; i < primeS.length(); i++){
            reversS = reversS + n % 10;
            n/=10;
        }
        if (primeS.equals(reversS)) { return true;}
        else {return false;}
    }
}

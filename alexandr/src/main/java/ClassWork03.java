import java.util.Scanner;

public class ClassWork03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the beginning of interval");
        int beginOfInterval = scan.nextInt();
        System.out.println("Enter the ending of interval");
        int endOfInterval = scan.nextInt();
        System.out.println(sumOfInterval(beginOfInterval,endOfInterval));
    }

    static int sumOfInterval (int startInterval, int endInterval) {
        int sum = 0;
        for (int i = startInterval; i <= endInterval; i++) {
           sum+=i; 
        }
        return sum;
    }
}

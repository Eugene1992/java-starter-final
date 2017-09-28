package hw04;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("do you want to print numbers?");
       // int yes=scan.nextInt();
        int x =24651;
        int y=x%100;
        int z=x/100000;
        //if ()


        String str="";
        str=Double.toString(x);
        System.out.println(str.length());
        System.out.println(str);


        System.out.println(y);
        System.out.println(z);

    }

}

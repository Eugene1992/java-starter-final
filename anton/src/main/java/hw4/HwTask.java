package hw4;

import java.util.Scanner;

public class HwTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Please choose task which you want to check:\n1 - Devil Tickets; 2 - Clock; 3 - Lucky Tickets");
        int choose = scan.nextInt();
        System.out.println("Do you like to print all these numbers?");
        int chooseToPrint = scan.nextInt();

        switch (choose) {
            case 1:
                count = devilTickets(count, chooseToPrint);
                break;
            case 2:
                count = eClock(count, chooseToPrint);
                break;
            case 3:
                count = luckyTickets(count, chooseToPrint);
                break;
        }
        System.out.println("You can see such type of situations " + count + "times.");
    }


    static int devilTickets(int count, int chooseToPrint) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                if (i == 1 && j == 3 || j == 1 && k == 3 || k == 1 && l == 3 || l == 1 && m == 3 || m == 1 && n == 3) {
                                    count++;
                                    if (chooseToPrint == 1) {
                                        System.out.print((i * 100000 + j * 10000 + k * 1000 + l * 100 + m * 10 + n + " "));
                                    }
                                    if (count % 10 == 0 && chooseToPrint == 1) {
                                        System.out.println("");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }


    static int eClock(int count, int chooseToPrint) {
        int n = 10;
        for (int i = 0; i <= 2; i++) {
            if (i == 2) {
                n = 4;
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 10; l++) {
                        if (i == l && j == k) {
                            count++;
                            if (chooseToPrint == 1) {
                                System.out.print((i * 10 + j + ":" + k + l + " "));
                            }
                            if (count % 10 == 0 && chooseToPrint == 1) {
                                System.out.println("");
                            }
                        }
                    }
                }
            }
        }
        return count;
    }


    static int luckyTickets(int count, int chooseToPrint) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                if (i + j + k == l + m + n) {
                                    count++;
                                    if (chooseToPrint == 1) {
                                        System.out.print((i * 100000 + j * 10000 + k * 1000 + l * 100 + m * 10 + n + " "));
                                    }
                                    if (count % 10 == 0 && chooseToPrint == 1) {
                                        System.out.println("");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
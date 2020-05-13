package Replit;

import java.util.Scanner;

public class R092FactorialLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long factoriel=1;
        for (int i = 1; i <=n ; i++) {
            factoriel*=(long)i;
        }
        System.out.println (factoriel);


    }
}

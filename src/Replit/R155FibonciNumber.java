package Replit;

import java.util.Scanner;


public class R155FibonciNumber {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        int num = scan.nextInt ();
        fib ( num );
    }
    /*
    In Fibonacci series, next number is the sum of previous two numbers
    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
    The first two numbers of Fibonacci series are 0 and 1.
    Given a number num, print n-th Fibonacci Number.
     */

    public static void fib (int num) {
        //WRITE YOUR CODE HERE
        int total = 0;
        if (num == 0) System.out.println ( 0 );
        else if (num == 1) System.out.println ( 1 );
        else {
            int n1 = 0, n2 = 1;
            for (int i = 2; i <= num; i++) {
                total = n1 + n2; // it start with  0 1
                n1 = n2; // n1 needs to jump to left
                n2 = total; //n2 needs jump left
            }
            System.out.println ( total );
        }

    }
}

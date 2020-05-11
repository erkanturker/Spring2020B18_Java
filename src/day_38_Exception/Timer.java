package day_38_Exception;


import java.util.Scanner;

public class Timer {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println("please enter the number of minutes");

        int m = scanner.nextInt ();
        while (m > 0) {
            m--;
            int s = 60;
            while (s > 0) {
                try {
                    Thread.sleep ( 1000 );
                    s--;
                    System.out.println ( m + " Minutes and " + s + " Seconds" );
                } catch (Exception e) {
                    System.out.println ( "This is an Exception" );
                }
            }
        }
        System.out.println ( " \n \t \t********************************************* " );
        System.out.println ( "  \t \t***                                       *** " );
        System.out.println ( "   \t \t***  Times is Up, Please take your seats! *** " );
        System.out.println ( "    \t \t***                                       *** " );
        System.out.println ( "     \t \t********************************************* " );

    }
}

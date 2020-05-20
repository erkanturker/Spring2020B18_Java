package Replit;

import org.w3c.dom.ls.LSOutput;

public class R143MethodSimpleprintpattern {
    public static void printHollowRect ( ) {
        // write your code here:
        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                System.out.println ( "*****" );
            } else System.out.println ( "*   *" );

        }

    }// end your code

    public static void main (String[] args) {
        next3 ( 2 );
        printHollowRect ();

    }

    public static void sign (int n) {
        //your code here
        if (n > 0) {
            System.out.println ( 1 );
        } else if (n == 0) System.out.println ( 0 );
        else System.out.println ( -1 );

    }//end sign

    public static void plus_minus (int[] arr) {
        int pos = 0;
        int neg = 0;
        int zer = 0;
        for (int each : arr) {
            if (each > 0) pos++;
            else if (each == 0) zer++;
            else neg++;
        }
        System.out.println ( "positives:" + pos + ", " + "negatives:" + neg + ", " + "zeros:" + zer );
    }

    public static void person (String info) {
        String[] splitInfo = info.split ( "," );
        System.out.println ( "person name: " + splitInfo[0] + " last name:" + splitInfo[1] + " age:" + splitInfo[2] );
        //your code here


    }//

    public static void next3 (int num) {
        System.out.print ( ++num + " " );
        System.out.print ( ++num + " " );
        System.out.print ( ++num );
    }

    public static int max (int x, int y) {
        return (x > y) ? x : y;
    }

    public static boolean isEven (int n) {
        return (n % 2 == 0) ? true : false;
    }

    public static String c_profits (int buyPrice, int sellPrice) {
        String result = "";
        if (sellPrice > buyPrice) {
            result = "profit";
            return result;
        } else if (buyPrice == sellPrice) {
            result = "no loss";
            return result;
        } else {
            result = "loss";
            return result;
        }
        //your code heere
    }



}

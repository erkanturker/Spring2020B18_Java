package Replit;

import java.util.Arrays;

public class R178MergeArrays {

    public static void main (String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = mergR ( a, b );
        System.out.println ( Arrays.toString ( c ) );

    }

    public static int[] mergR (int[] a, int[] b) {
        int[] merArr = new int[a.length + b.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            merArr[i] = a[i];
            z++;
        }
        for (int i = 0; i < b.length; i++) {
            merArr[z] = b[i];
            z++;
        }


        return merArr;
    }

    public static String reverse (String input) {
        String reverse = "";
        for (int i = input.length () - 1; i >= 0; i--) {
            reverse += "" + input.charAt ( i );
        }
        return reverse;
    }

    public static boolean isError (String line) {
        if (line.startsWith ( "error" )) {
            return true;
        }
        return false;
    }
}

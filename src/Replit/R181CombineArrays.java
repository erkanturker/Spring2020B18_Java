package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R181CombineArrays {
    public static void main (String[] args) {
        String[] a = {"a", "k"};
        String[] b = {"m", "a", "l"};
        System.out.println ( combineRs ( a, b ) );
    }

    public static String combineRs (String[] r1, String[] r2) {
        String text = "";
        text = Arrays.toString ( r1 );
        text += Arrays.toString ( r2 );
        text = text.replace ( "[", "" );
        text = text.replace ( "]", "" );
        text = text.replace ( ", ", "" );
        return text;
    }

    public static int sum (ArrayList< Integer > ints) {
        //write code here
        int total = 0;
        for (int each : ints) {
            total += each;
        }
        return total;

    }

    public static ArrayList< String > combineAL (ArrayList< String > wordList1, ArrayList< String > wordList2) {

        ArrayList< String > newList = new ArrayList<> ( ) ;
        newList.addAll ( wordList1 );
        newList.addAll ( wordList2 );
        return newList;
    }
}

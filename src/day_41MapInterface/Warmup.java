package day_41MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Warmup {
    /*
    Write program that remove even numbers from the list with for loop
        Write program that remove odd numbers from the list with while loop


     */
    public static void main (String[] args) {

        List< Integer > list1 = new ArrayList<> ( Arrays.asList ( 1, 2, 3, 4, 5, 6, 7, 12, 14, 15, 18 ) );
        for (Iterator< Integer > it = list1.iterator (); it.hasNext (); ) {
            int a = it.next ();
            if (a % 2 == 0) {
                it.remove ();
            }
        }
        System.out.println ( list1 );

        System.out.println ("--------------------------------");

        List< Integer > list = new ArrayList<> ( Arrays.asList ( 1, 2, 3, 4, 5, 6, 7, 12, 14, 15, 18 ) );
        Iterator< Integer > iterator = list.iterator ();
        while (iterator.hasNext ()) {
            int n = iterator.next ();
            if (n % 2 != 0) {
                iterator.remove ();
            }
        }
        System.out.println ( list );


    }
}

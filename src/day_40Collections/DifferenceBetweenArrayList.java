package day_40Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DifferenceBetweenArrayList {
    public static void main (String[] args) {
        List< String > arrayList = new ArrayList<> ();
        List< String > linkList = new LinkedList<> ();
        timeCalculator ( "arraylist", arrayList );
       timeCalculator ( "linklist", linkList );
        timeFinding ( "2000000",linkList );
        System.out.println ("=====================");
        timeFinding (  "2000000",arrayList);




    }

    public static void timeCalculator (String listType, List< String > list) {

       int startTime = (int) System.currentTimeMillis ();

        for (int i = 0; i < 10000000; i++) {
            list.add ("" + i );
        }

       int finishTime = (int) System.currentTimeMillis ();
        System.out.println ( listType + " " + (finishTime - startTime) + " ms" );


    }

    public static void timeFinding(String search, List< String > list ){
        int startTime = (int) System.currentTimeMillis ();

        System.out.println ( list.contains ( search ));


        int finishTime = (int) System.currentTimeMillis ();
        System.out.println ( " " + (finishTime - startTime) + " ms" );

    }


}

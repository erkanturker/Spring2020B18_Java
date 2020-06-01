package day_40Collections;

import java.util.*;

public class IterableInterface {
    public static void main (String[] args) {
        List< Integer > list = new ArrayList<> ();
        list.addAll ( Arrays.asList ( 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1 ) );
        for (int i = 0; i < list.size (); i++) {
            if (list.get ( i ) == 1) {
                list.remove ( i );
            }

        }
        System.out.println ( list );  //normally it should delete all 1 but it couldnot We need iterrator
        List< Integer > list2 = new ArrayList<> ();
        list2.addAll ( Arrays.asList ( 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1 ) );
        Iterator< Integer > iterator = list2.iterator ();

        boolean a = iterator.hasNext (); //it returns boolenan
        System.out.println ( a );

        System.out.println ( iterator.next () );//next(): if hasNext() is true, it rertives the current iteration from the collection type
        System.out.println ( "==========================" );
        List< Integer > list3 = new ArrayList<> ();
        list3.addAll ( Arrays.asList ( 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1 ) );
        Iterator< Integer > iterator1 = list3.iterator ();

        while (iterator1.hasNext ()) {
            int num = iterator1.next ();
            if (num == 1) {
                iterator1.remove ();
            }
        }
        System.out.println ( list3 );

        System.out.println ( "=========================================================" );
        Set< Integer > set = new LinkedHashSet<> ();
        set.addAll ( Arrays.asList ( 10, 20 ) );
        Iterator< Integer > iterator2 = set.iterator ();
        System.out.println ( iterator2.hasNext () ); //true
        System.out.println ( iterator2.next () ); //10

        System.out.println ( iterator2.hasNext () );//true
        System.out.println ( iterator2.next () );//20

        System.out.println ( iterator2.hasNext () );//false
        //System.out.println (iterator2.next ());//gives exceptiopm

        System.out.println ( "=========================================================" );
        //will remove who has e in their name
        String[] name = {"Erkan", "Ekrem", "Asim", "Zehra"};
        Set< String > stringSet = new LinkedHashSet<> ();
        stringSet.addAll ( Arrays.asList ( name ) );
        Iterator< String > iterator3 = stringSet.iterator ();

        while (iterator3.hasNext ()) {
            String str = iterator3.next ();

            //str.toLowerCase ().contains ( "e" );
            if (str.contains ( "e" ) || str.contains ( "E" )) {
                iterator3.remove ();
            }
        }
        System.out.println ( stringSet );
        System.out.println ( "=========================================================" );
        List< Integer > myList = new ArrayList<> ();
        myList.addAll ( Arrays.asList ( 10, 100, 500, 99, 300, 79, 100 ) );
        Iterator< Integer > itr = myList.iterator ();
        while (itr.hasNext ()) {
            int numbers = itr.next ();
            if (numbers > 100) {
                itr.remove ();
            }
        }

        System.out.println ( myList );


        System.out.println ( "=========================================================" );

        String[] students = {"Erhan", "Erkan", "Ercan", "Erdem", "Ekrem", "Alicemal", "Ahmet", "Erhan"};

        List< String > nameList = new ArrayList<> ();

        nameList.addAll ( Arrays.asList ( students ) );
        for (Iterator< String > itr1 = nameList.iterator (); itr1.hasNext (); ) {
            String studentName = itr1.next ();
            if (studentName.equals ( "Erhan" )) {
                itr1.remove ();
            }
        }
        System.out.println ( nameList );


    }
}

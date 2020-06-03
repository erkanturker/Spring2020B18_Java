package day_41MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExpression {
    public static void main (String[] args) {

        Predicate< Integer > remove100 = p -> p == 100; //this is lamda expression
        Predicate< Integer > removeAbove100 = p -> p >= 100;
        List< Integer > list = new ArrayList<> ( Arrays.asList ( 10, 100, 200, 100, 20, 30 ) );
        list.removeIf ( remove100 );
        System.out.println ( list );//[10, 200, 20, 30]

        List< Integer > list2 = new ArrayList<> ( Arrays.asList ( 10, 100, 200, 100, 20, 30 ) );
        //P represetn each value on the list
        // list2.removeIf ( removeAbove100 ); it can be that way as well
        list2.removeIf ( P -> P >= 100 );
        System.out.println ( list2 );

        //foreach
        List< Integer > list3 = new ArrayList<> ( Arrays.asList ( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ) );
        list3.forEach ( p -> {
            if (p < 5) System.out.print ( p + " " );
        } ); //it will print below 5
        System.out.println ();

        list3.forEach ( System.out::print ); //we can print with like that
        System.out.println ();

        //removes all names is Ahmed

        List< String > nameList = new ArrayList<> ();
        nameList.addAll ( Arrays.asList ( "Ahmet", "Erkan", "Asim", "Mubarek", "Ekrem" ) );
        Predicate< String > removeAhmet = p -> p.equalsIgnoreCase ( "Ahmet" );
        nameList.removeIf ( removeAhmet );
        System.out.println ( nameList );//[Erkan, Asim, Mubarek]


        //Create Two list second one is empty add the names start with E to the empty list

        List< String > names = new ArrayList<> ();
        names.addAll ( Arrays.asList ( "Ahmet", "Erkan", "Asim", "Mubarek", "Ekrem", "Mehmet" ) );
        List< String > names2 = new ArrayList<> ();
        names.forEach ( p -> {
            if (p.startsWith ( "E" )) {
                names2.add ( p );
            }
        } );
        System.out.println ( names2 );//[Erkan, Ekrem]

        //remove if the end with start from et

        names.removeIf ( p -> p.endsWith ( "et" ) );
        System.out.println ( names );//[Erkan, Asim, Mubarek, Ekrem]

    }
}

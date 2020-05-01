package Replit;

/*
search method accepts ArrayList of Strings and String find.
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"

for example:

search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")

search(["hello","world"],"goodbye")
returns:
"search failed"
(no "goodbye" in any element)

 */
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class methodArrayListRemoveeveryOther {

    public static void main (String[] args) {
        ArrayList< String > arr = new ArrayList< String > ();
        arr.add ( "2" );
        arr.add ( "6" );
        arr.add ( "foo bar" );
        arr.add ( "abc" );


        String find_tst = search ( arr, "abc" );
        System.out.print ( find_tst );//foo bar
    }

    public static String search (ArrayList< String > r, String find) {
        String status="search failed";
        for (int i = 0; i < r.size (); i++) {
            if (r.get ( i ).contains ( find )) {
                return r.get ( i );
            }



        }

        return status;
    }
}




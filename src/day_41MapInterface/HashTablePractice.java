package day_41MapInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashTablePractice {
    /*
    HashTable(C): Key and Value cannot be null. no null allowed
			Is synchronized ==> Thread-Safe
			very slow
     */

    public static void main (String[] args) {
        Map<String, Integer>map = new Hashtable<> (  );
        map.put ( "A",null );//Key and Value cannot be null. no null allowed
        map.put ( null,null ); //it will give us nullpointer exception

    }
}

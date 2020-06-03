package day_41MapInterface;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/*
LinkedHashMap(C): maintains the insertion order as its
		doubly linked:  put() & remove() are faster than hashmap
					get() is slower than hashmap
 */

public class LinkedHashMapPractice {
    public static void main (String[] args) {
        Map< String, Integer > map = new LinkedHashMap<> ();
        //it will only store last A keyvalue
        map.put ( "A", 2 );
        map.put ( "A", 3 );
        map.put ( "A", 5 );
        System.out.println (map); //{A=5}
        //key value can be duplicate
        map.put ( "B" ,5);
        System.out.println (map);//{A=5, B=5}
    }
}

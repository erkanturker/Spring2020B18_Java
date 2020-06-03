package day_41MapInterface;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
put(key, value): inserts key and value objects to the map

	get(key): retrives the value of the given key

	remove(Key): removes the given key object and its value

	size(): retruns the size of the map

	containsKey(Key): verifies if the given Key is exist in the map. retruns boolean

	containsValue(Value): verifies if the given value is exist in the map. retruns boolean

	keySet(): returns all the keys as Set Interface

	clear(): removes everything, size will become 0


 */

public class MapInterfaceHashmap {
    public static void main (String[] args) {
        Map< String, Double > employees = new HashMap<> ();
        employees.put ( "Erkan", 200000.99 );
        employees.put ( "Zehra", 150000.02 );
        employees.put ( "Asim", 180000.12 );
        employees.put ( "Ekrem", 3000000.00 );
        employees.put ( "CyberTek", 100000.00 );
        employees.put ( null,null );
        System.out.println ( employees );

        double salaryEkrem = employees.get ( "Ekrem" );
        System.out.println ( salaryEkrem );
        employees.remove ( "CyberTek" ); //remove(Key): removes the given key object and its value
        System.out.println ( employees.size () );

        boolean a = employees.containsKey ( "Ekrem" );//containsKey(Key): verifies if the given Key is exist in the map. retruns boolean
        System.out.println ( a );

        boolean b = employees.containsValue ( 10 );//verifies if the given Key is exist in the map. retruns boolean
        System.out.println ( b );

        System.out.println ( employees.keySet () );//keySet(): returns all the keys as Set Interface

        Set< String > keysetFromEmployee = employees.keySet ();
        System.out.println ( keysetFromEmployee );

        // employees.clear (); clear(): removes everything, size will become 0


    }
}

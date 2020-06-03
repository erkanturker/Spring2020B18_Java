package day_41MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    /*
    TreeMap(C) : implementing SortedMap it does not accept null
			sorts the keys in ascending order
     */
    public static void main (String[] args) {
        Map<String,Double> employees = new TreeMap<> (  );

        employees.put ( "Erkan", 200000.99 );
        employees.put ( "Zehra", 150000.02 );
        employees.put ( "Asim", 180000.12 );
        employees.put ( "Ekrem", 3000000.00 );
        employees.put ( "CyberTek", 100000.00 );
        employees.put ( "Imsa",null); //value can be null
      //  employees.put ( null,null ); it does not accept key  null


        System.out.println (employees);


    }
}

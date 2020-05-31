package day_40Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
    public static void main (String[] args) {
        // List<Integer> list1 = new List< Integer > ();  'List' is abstract; cannot be instantiated
        List<Integer>list2 = new ArrayList<> (  );
        List<String>list3= new LinkedList<> (  );
        List<Double>list4= new Vector<> (  );
    }
}

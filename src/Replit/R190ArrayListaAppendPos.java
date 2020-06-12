package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class R190ArrayListaAppendPos {

    public static void main (String[] args) {
        ArrayList< Integer > newList = new ArrayList<> ( Arrays.asList ( 4, -6, 3, -8, 0, 4, 3 ) );
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

        System.out.println ( appendPosSum ( newList ) );
        System.out.println (twoTimes (   newList ));
        System.out.println ( newList.get ( 0 ) );
        System.out.println (swap ( wordList,0,3 ));
        removeAll ( wordList,"hi" );


    }

    public static ArrayList< Integer > appendPosSum (ArrayList< Integer > list) {

        ArrayList< Integer > newList = new ArrayList<> ();
        int total = 0;
        for (Integer each : list) {
            if (each > 0) {
                newList.add ( each );
                total += each;
            }
        }
        newList.add ( total );
        return newList;
    }

    public static ArrayList< Integer > twoTimes (ArrayList< Integer > list) {
        ArrayList<Integer> newList = new ArrayList<> (  );
        for (int each:list) {
            newList.add ( each );
            newList.add ( each );
        }
        return newList;
    }
    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2)
    {
        String temp= list.get ( pos1 );
        String temp2= list.get ( pos2 );
        list.set ( pos1,temp2 );
        list.set ( pos2,temp );
        return list;
    }
    public static void removeAll(ArrayList<String> list, String word){
        list.removeIf ( each -> each.equals ( word ) );
        System.out.println (list);
    }

}

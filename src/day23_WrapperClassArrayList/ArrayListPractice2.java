package day23_WrapperClassArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0) continue;
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {

            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        for (int each: list){
            System.out.print(each+" ");

        }

        int num =list.get(7); // unboxing there is no primitive in ArrayList
        list.clear(); // the size of list becomes 0
        //System.out.println(list.get(2)); //it will give us an error
        System.out.println();
       ArrayList<Integer> list2 =new ArrayList<>();
       for (int i=20;i>=0;i--){
           list2.add(i);
       }
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        String txt=";";
        txt.substring(0,txt.length());

    }
}
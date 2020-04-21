package day24_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvetingArraytoArrayList {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6}; // becaouse array list accept only object
        ArrayList list =new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        String [] arr2 ={"Java", "Phyton"," C#"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(list2);
        System.out.println(list2.isEmpty());

        int [] arr3 = {1,2,4,5,6};
        // ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(arr3)); // It will gives us an error





    }
}

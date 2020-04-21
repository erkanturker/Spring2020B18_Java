package day24_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*

sorting the arrayList:
        Collections.sort(VariableName);  sorts in ascending order

        Collections class is presented in "java.util" package
 */
public class ArrayListSorting {

    public static void main(String[] args) {
        Integer [] arr = { 100,200,4000,50,2000,300,10};
        ArrayList <Integer>list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        Collections.sort(list); //
        System.out.println(list);
    }
}

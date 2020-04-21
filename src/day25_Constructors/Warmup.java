package day25_Constructors;

// 1. Find a maximum value from array List

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;

public class Warmup {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(9);
        list.add(0);
        list.add(100);
        System.out.println(maximum(list));
        System.out.println(minumum(list));
    }


    public static int maximum(ArrayList<Integer> list){

        int max=Integer.MIN_VALUE;

        for (int each: list) {
            if(each>max) max=each;
        }

        return max;
    }

    public static int minumum (ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for (int each:
             list) {
            if(each<min){
                min=each;
            }

        }
        return min;
    }
}

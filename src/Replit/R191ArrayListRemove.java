package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class R191ArrayListRemove {

    public static void main (String[] args) {

        ArrayList< Integer > arr = new ArrayList<> ();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll ( Arrays.asList ( nums ) );

        System.out.print ( removeInst ( arr, 1 ) );

        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2},//sum = 3
        };


        int[] sums = rowSums ( a );
for(int sum : sums) System.out.println(sum);
        //this should print 4 6 11 3


    }//end main

    public static ArrayList< Integer > removeInst (ArrayList< Integer > r, Integer n) {

        r.removeIf ( each -> n == each );
        return r;
    }

    public static int refuel_times (ArrayList< Integer > deliveries, int max_fuel) {
        int totalDel = 0;

        for (int each : deliveries) {
            totalDel += each;
        }
        if (totalDel % max_fuel == 0) return totalDel / max_fuel;
        else return (totalDel / max_fuel) + 1;
    }

    public static int[] rowSums (int[][] nums) {
        int[] rowNum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int total = 0;
            for (int j = 0; j < nums[i].length; j++) {
                total+=nums[i][j];
            }
            rowNum[i]=total;
        }
        return rowNum;
    }

}

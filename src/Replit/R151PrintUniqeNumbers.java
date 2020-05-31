package Replit;

import java.util.*;
import java.util.stream.Collectors;

public class R151PrintUniqeNumbers {

    public static void main (String[] args) {
        int[] arr = {1, 2, 4, 444, 5, 5, 1, 2};
        printUniqueNumbers ( arr );
        printUniqe ( arr );

    }

    public static void printUniqueNumbers (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
            if (count == 1) System.out.println ( nums[i] );

        }


    }

    public static void printUniqe (int[] nums) {
        List< Integer > list1 = new ArrayList<> ();
        for (int each : nums) {
            list1.add ( each );
        }

        List< Integer > list2 = list1.stream ().distinct ().collect ( Collectors.toList () );
        System.out.println ( list2 );

    }
}

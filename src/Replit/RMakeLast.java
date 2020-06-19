package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class RMakeLast {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        int size = scan.nextInt ();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt ();
        }
        int[] newArr = new int[nums.length * 2];
        newArr[newArr.length - 1] = nums[nums.length - 1];
        System.out.println ( Arrays.toString ( newArr ) );
    }

    public static int[] addElements (int[] ints1, int[] ints2) {

        int[] newArr = new int[5];
        for (int i = 0; i < 5; i++) {
            newArr[i] = ints1[i] + ints2[i];
        }
        return newArr;
    }

}

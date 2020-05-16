package Replit;

import java.util.Scanner;

public class R110ArraysCountEvens {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count =0;
        for (int each: nums) {
            if(each%2==0)count++;
        }
        System.out.println (count);
    }
}

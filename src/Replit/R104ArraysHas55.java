package Replit;

import java.util.Scanner;

public class R104ArraysHas55 {
    public static void main (String[] args) {
        Scanner input = new Scanner ( System.in );
        int[] nums = {input.nextInt (), input.nextInt (), input.nextInt (), input.nextInt (), input.nextInt ()};
        boolean result = false;

        //TODO Type your code below:

        for (int i = 0; i < 4; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                result = true;
                break;
            }
        }
        System.out.println ( result );
    }
}

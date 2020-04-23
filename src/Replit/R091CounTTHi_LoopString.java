package Replit;

/*
Example:
input: ab chi how hi
output: 2

Example:
input: hi code java please
output: 1

 */

import java.util.Scanner;

public class R091CounTTHi_LoopString {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String str = scan.nextLine();
        int count=0;
        for (int i = 0; i <str.length ()-1 ; i++) {
            if(str.substring ( i,i+2).equals ( "hi" )){
                count++;
            }
        }
        System.out.println (count);



    }
}

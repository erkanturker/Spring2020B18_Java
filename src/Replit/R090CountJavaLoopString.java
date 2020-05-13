package Replit;

import java.util.Scanner;
/*
Return the number of times that the string "java" appears anywhere in the given string word.
Example:
input: javaxjava
output: 2

 */

public class R090CountJavaLoopString {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String word = scan.next ();
        int count = 0;
        for (int i = 0; i < word.length () - 3; i++) {
            if (word.substring ( i, i + 4 ).equals ( "java" )) {
                count++;
            }
        }
        System.out.println ( count );
    }
}

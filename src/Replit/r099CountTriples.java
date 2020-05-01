package Replit;

/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.
 */

import java.util.Scanner;

public class r099CountTriples {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String str = scan.next ();
        int count = 0;
        int j =1;
        int z=2;

        for (int i = 0; i <str.length ()-2 ; i++) {
            if(str.charAt ( i )==str.charAt ( j )&& str.charAt ( i )==str.charAt ( z )){
                count++;
            }
            j++;
            z++;
        }
        System.out.println (count);

    }
}
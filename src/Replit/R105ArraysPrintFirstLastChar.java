package Replit;

import java.util.Scanner;

public class R105ArraysPrintFirstLastChar {
    public static void main (String[] args) {
        Scanner input = new Scanner ( System.in );
        String[] words = {input.nextLine (), input.nextLine (), input.nextLine (), input.nextLine (), input.nextLine ()};
        String result = "[";


        //TODO: Write your code below
        for (int i = 0; i < 5; i++) {
            result += "" + words[i].charAt ( 0 ) + words[i].charAt ( words[i].length () - 1 ) + ", ";
        }

        result = result.substring ( 0, result.lastIndexOf ( ", " ) );
        result += "]";
        System.out.println ( result );
    }
}
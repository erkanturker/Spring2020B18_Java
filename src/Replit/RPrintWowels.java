package Replit;

import java.util.Scanner;

public class RPrintWowels {
    public static void main (String[] args) {
        Scanner inp = new Scanner ( System.in );
        System.out.print ( "In:" );
        String word = inp.nextLine ();
        //write your code below

        String vowel = "aeiou";
        String newWord = "";
        for (int i = 0; i < word.length (); i++) {
            if (vowel.contains ( "" + word.charAt ( i ) ))
                newWord+=""+word.charAt ( i );
        }
        System.out.println (newWord);


    }
}

package Replit;

import java.util.Scanner;

public class R103ArraysReverseSentence2 {
    public static void main (String[] args) {
        Scanner input = new Scanner ( System.in );
        String sentence = input.nextLine ();

        String reversed = "";
        //TODO: start your code here
        String[] split = sentence.split ( " " );

        for (int i = split.length - 1; i >= 0; i--) {
            reversed += split[i]+" ";


        }
        System.out.println (reversed.trim ());
    }
}

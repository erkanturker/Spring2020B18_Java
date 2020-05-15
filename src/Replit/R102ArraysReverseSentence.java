package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class R102ArraysReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        String sentence = input.nextLine ();

        String[] splitsentence =sentence.split ( " " );
        System.out.println ( Arrays.toString ( splitsentence ) );
        int index = splitsentence.length-1;
        for (int i = index; i >=0 ; i--){
            System.out.println (splitsentence[i]);

        }

    }
}

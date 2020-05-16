package Replit;

import java.util.Scanner;

public class R106ArraysSplitSentence {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] split = sentence.split ( " " );
        for (String each: split) {
            System.out.println (each);
        }


        //type your code below
    }
}

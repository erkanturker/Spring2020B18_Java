package Replit;

import java.util.Scanner;

public class R115ArraysFindingMaxLength {
    public static void main (String[] args) {
        Scanner input= new Scanner ( System.in );
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        String maxlength ="";

        for (int i = 0; i <5 ; i++) {
            if(words[i].length ()>maxlength.length ()) {
                maxlength=words[i];
            }

        }
        System.out.println (maxlength);

    }
}

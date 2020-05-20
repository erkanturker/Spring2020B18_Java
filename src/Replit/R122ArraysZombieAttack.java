package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class R122ArraysZombieAttack {
    public static void main (String[] args) {

        Scanner input = new Scanner ( System.in );
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt ();
        }
        int day = 0;
        System.out.println ( "Day "+day + " " + Arrays.toString ( inhabitants ) );
        for (int k = 0; k <inhabitants.length; k++) {
            while (inhabitants[k]>0) {
                for (int i = 0; i < inhabitants.length; i++) {

                    inhabitants[i] /= 2;

                }
                day++;
                System.out.println ( "Day "+day + " " + Arrays.toString ( inhabitants ) );
            }
        }
        System.out.println ("---- EXTINCT ----");






    }

}


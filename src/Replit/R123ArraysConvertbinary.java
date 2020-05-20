package Replit;

import java.util.Scanner;

public class R123ArraysConvertbinary {
    public static void main (String[] args) {

        Scanner input = new Scanner ( System.in );

        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt ();
        }
        int total = 0;
        int power = 128;
        for (int i = 0; i < binary.length; i++) {
            total += binary[i] * power;
            power /= 2;
        }
        System.out.println ( total );


        //TODO: Write your code below.
    }
}


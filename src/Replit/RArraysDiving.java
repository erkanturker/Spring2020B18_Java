package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class RArraysDiving {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <=7 ; i++) {
            System.out.println ("Enter score for judge "+i+":");
            int number = scanner.nextInt ();
            list.add ( number );

        }
        System.out.println ("Enter difficulty:");
        double dif = scanner.nextDouble ();
        double total = 0;
        Collections.sort ( list );
        list.remove ( 0 );
        list.remove ( list.size ()-1 );
        for (Integer each:list) {
            total+=each;
        }
        total*=dif;
        total*=0.6;
       System.out.println (total);
    }

    public static double score(ArrayList<Integer> list,double dif){
        double total = 0;
        Collections.sort ( list );
        list.remove ( 0 );
        list.remove ( list.size ()-1 );
        for (Integer each:list) {
            total+=each;
        }
        total*=dif;
        total*=0.6;

        return total;
    }
}
